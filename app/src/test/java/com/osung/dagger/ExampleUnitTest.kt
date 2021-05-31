package com.osung.dagger

import android.util.Log
import com.osung.dagger.first.DaggerMyComponent
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
}