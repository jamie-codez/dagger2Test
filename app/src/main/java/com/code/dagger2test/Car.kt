package com.code.dagger2test

import android.util.Log
import javax.inject.Inject

private const val TAG = "Car"
class Car @Inject constructor(val engine: Engine,val wheels: Wheels) {
    fun drive(){
        Log.d(TAG, "driving...")
    }
    @Inject
    fun enableRemote(remote:Remote){
        remote.setListener(this)
    }
}