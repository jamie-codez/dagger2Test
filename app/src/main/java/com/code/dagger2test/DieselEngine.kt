package com.code.dagger2test

import android.util.Log
import javax.inject.Inject

private const val TAG = "DieselEngine"
class DieselEngine @Inject constructor() : Engine {
    override fun start() {
        Log.d(TAG, "Diesel engine started....")
    }
}