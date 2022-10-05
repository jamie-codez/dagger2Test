package com.code.dagger2test.car

import android.util.Log
import javax.inject.Inject

private const val TAG = "PetrolEngine"
class PetrolEngine @Inject constructor(private val horsePower:Int) : Engine {
    override fun start() {
        Log.d(TAG, "Petrol engine started...\n Horsepower: $horsePower")
    }
}