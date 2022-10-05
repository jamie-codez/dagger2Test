package com.code.dagger2test.car

import android.util.Log
import javax.inject.Inject

private const val TAG = "Car"
class Car @Inject constructor(val engine: Engine, val wheels: Wheels) {
    fun drive(){
        engine.start()
        Log.d(TAG, "driving...")
    }
    @Inject
    fun enableRemote(remote: Remote){
        remote.setListener(this)
    }
}