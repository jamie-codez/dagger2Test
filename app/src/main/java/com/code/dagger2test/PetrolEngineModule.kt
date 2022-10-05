package com.code.dagger2test

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class PetrolEngineModule {
    @Binds
    abstract fun bindPetrolEngine(petrolEngine: PetrolEngine):Engine
}