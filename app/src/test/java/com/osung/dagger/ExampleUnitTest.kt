package com.osung.dagger

import com.osung.dagger.first.DaggerMyComponent
import com.osung.dagger.module.DaggerManComponent
import com.osung.dagger.module.DaggerPersonComponent
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val myComponent = DaggerMyComponent.create()

        assertEquals(myComponent.getString(), "Hello World")
    }

    @Test
    fun secondModuleTest() {
        val secondModule = DaggerPersonComponent.create()

        assertEquals(secondModule.getPerson().name, "Charles")
        assertEquals(secondModule.getPerson().age, 100)
    }

    @Test
    fun extendModuleTest() {
        val extendModule = DaggerManComponent.create()
        extendModule.isMan()
    }
}