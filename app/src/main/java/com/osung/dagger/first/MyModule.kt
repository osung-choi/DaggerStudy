package com.osung.dagger.first

import dagger.Module
import dagger.Provides

@Module //의존성을 주입할 클래스에 선언
class MyModule {
    @Provides //의존성을 주입할 메소드에 선언
    fun provideHelloWorld(): String {
        return "Hello World"
    }

//    @Provides //메서드의 반환형을 보고 컴포넌트 내에서 의존성이 관리되므로 중복되는 반환형이 하나의 컴포넌트 내에 존재해서는 안 된다.
//    fun provideCharles(): String {
//        return "Charles"
//    }
}