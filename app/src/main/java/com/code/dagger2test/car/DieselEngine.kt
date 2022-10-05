package com.code.dagger2test.car

import android.util.Log
import com.code.dagger2test.car.Engine
import javax.inject.Inject

private const val TAG = "DieselEngine"
class DieselEngine constructor(private val horsePower:Int) : Engine {
    override fun start() {
        Log.d(TAG, "Diesel engine started....\n Horsepower: $horsePower")
    }
}