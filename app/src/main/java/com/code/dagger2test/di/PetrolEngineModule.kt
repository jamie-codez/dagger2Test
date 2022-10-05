package com.code.dagger2test.di

import com.code.dagger2test.car.DieselEngine
import com.code.dagger2test.car.Engine
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class PetrolEngineModule @Inject constructor(private val horsePower:Int) {
    @Provides
    fun providePetrolEngine(): Engine{
        return DieselEngine(horsePower)
    }
}