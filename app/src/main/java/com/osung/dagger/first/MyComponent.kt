package com.osung.dagger.first

import dagger.Component

@Component(modules = [MyModule::class]) //참조된 모듈 클래스로부터 의존성을 제공받는다.
interface MyComponent {
    //바인드된 모듈로부터 의존성을 제공
    //메서드의 반환형을 보고 모듈과의 관계를 맺으므로 바인드된 모듈로브터 해당 반환형을 갖는 메서드를 찾지 못한다면 컴파일 에러가 발생.
    fun getString(): String
}