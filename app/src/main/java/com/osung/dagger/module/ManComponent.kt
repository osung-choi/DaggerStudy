package com.osung.dagger.module

import dagger.Component

@Component(modules = [ManModule::class])
interface ManComponent {
    fun isMan(): Boolean
}