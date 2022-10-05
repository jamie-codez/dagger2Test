package com.code.dagger2test.di

import com.code.dagger2test.MainActivity
import com.code.dagger2test.car.Car
import dagger.Component

@Component(modules = [WheelsModule::class, DieselEngineModule::class])
interface CarComponent {
    fun getCar(): Car
    fun inject(mainActivity: MainActivity)
}