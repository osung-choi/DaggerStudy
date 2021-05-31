package com.osung.dagger.module

import dagger.Module
import dagger.Provides

@Module
class PersonModule {
    @Provides
    fun provideName(): String {
        return "Charles"
    }

    @Provides
    fun provideAge(): Int {
        return 100
    }

    @Provides //해당 파라미터 값을 자동으로 주입받는다.
    fun providePerson(name: String, age: Int): Person {
        return Person(name, age)
    }
}