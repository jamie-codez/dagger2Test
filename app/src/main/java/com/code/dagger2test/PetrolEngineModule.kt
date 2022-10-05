package com.code.dagger2test

import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule {
    @Provides
    fun providePetrolEngine(petrolEngine: PetrolEngine):Engine{
        return petrolEngine
    }
}