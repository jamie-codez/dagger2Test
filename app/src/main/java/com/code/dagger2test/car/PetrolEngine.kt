package com.code.dagger2test.car

import android.util.Log
import com.code.dagger2test.car.Engine
import javax.inject.Inject

private const val TAG = "PetrolEngine"
class PetrolEngine @Inject constructor() : Engine {
    override fun start() {
        Log.d(TAG, "Petrol engine started...")
    }
}