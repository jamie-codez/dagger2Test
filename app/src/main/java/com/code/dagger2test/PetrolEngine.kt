package com.code.dagger2test

import android.util.Log
import javax.inject.Inject

private const val TAG = "PetrolEngine"
class PetrolEngine @Inject constructor() : Engine {
    override fun start() {
        Log.d(TAG, "Petrol engine started...")
    }
}