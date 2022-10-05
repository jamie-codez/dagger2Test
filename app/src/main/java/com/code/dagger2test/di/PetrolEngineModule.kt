package com.code.dagger2test.di

import com.code.dagger2test.car.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {
    @Binds
    abstract fun bindPetrolEngine(petrolEngine: PetrolEngine): Engine
}