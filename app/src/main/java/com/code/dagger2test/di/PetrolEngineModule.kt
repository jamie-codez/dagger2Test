package com.code.dagger2test.di

import com.code.dagger2test.car.DieselEngine
import com.code.dagger2test.car.Engine
import com.code.dagger2test.car.PetrolEngine
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class PetrolEngineModule @Inject constructor(private val horsePower:Int) {
    @Provides
    fun provideHorsePower():Int{
        return horsePower
    }
    @Provides
    fun providePetrolEngine(engine: PetrolEngine): Engine{
        return engine
    }

}