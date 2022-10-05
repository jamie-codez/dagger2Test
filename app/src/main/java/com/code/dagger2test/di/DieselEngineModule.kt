package com.code.dagger2test.di

import com.code.dagger2test.car.DieselEngine
import com.code.dagger2test.car.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {
    @Binds
    abstract fun bindDieselEngine(dieselEngine: DieselEngine): Engine
}