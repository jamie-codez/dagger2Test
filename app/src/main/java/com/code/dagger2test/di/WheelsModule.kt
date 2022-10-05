package com.code.dagger2test.di

import com.code.dagger2test.car.Rim
import com.code.dagger2test.car.Tire
import com.code.dagger2test.car.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {
    companion object {
        @Provides
        @JvmStatic fun provideRims(): Rim {
            return Rim()
        }

        @Provides
        @JvmStatic fun provideTires(): Tire {
            val tire = Tire()
            tire.inflate()
            return tire
        }
        @Provides
        @JvmStatic fun provideWheels(rim: Rim, tire: Tire): Wheels {
            return Wheels(rim,tire)
        }
    }

}