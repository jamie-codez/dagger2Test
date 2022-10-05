package com.code.dagger2test.di

import com.code.dagger2test.MainActivity
import com.code.dagger2test.car.Car
import dagger.BindsInstance
import dagger.Component

@Component(modules = [WheelsModule::class, PetrolEngineModule::class])
interface CarComponent {
    fun getCar(): Car
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun horsePower(horsePower:Int):Builder
        fun build():CarComponent
    }
}