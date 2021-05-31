package com.osung.dagger.module

import dagger.Component

@Component(modules = [PersonModule::class])
interface PersonComponent {
    fun getPerson() : Person
}