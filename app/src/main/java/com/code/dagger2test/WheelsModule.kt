package com.code.dagger2test

import dagger.Module
import dagger.Provides

@Module
class WheelsModule {
    companion object {
        @Provides
        @JvmStatic fun provideRims():Rim{
            return Rim()
        }

        @Provides
        @JvmStatic fun provideTires():Tire{
            val tire = Tire()
            tire.inflate()
            return tire
        }
        @Provides
        @JvmStatic fun provideWheels(rim: Rim,tire: Tire):Wheels{
            return Wheels(rim,tire)
        }
    }

}