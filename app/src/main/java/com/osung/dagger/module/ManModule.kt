package com.osung.dagger.module

import dagger.Module
import dagger.Provides

//module 애노테이션의 includes 속성. 상속 하는 코드.
//부모 클래스와 중복되는 타입에 주의한다.
@Module(includes = [PersonModule::class])
class ManModule {
    @Provides
    fun getProvide(): Boolean {
        return true
    }
}