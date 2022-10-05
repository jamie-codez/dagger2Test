package com.code.dagger2test

import dagger.Component

@Component(modules = [WheelsModule::class])
interface CarComponent {
    fun getCar():Car
    fun inject(mainActivity: MainActivity)
}