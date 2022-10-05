package com.code.dagger2test

import dagger.Component

@Component
interface CarComponent {
    fun getCar():Car
    fun inject(mainActivity: MainActivity)
}