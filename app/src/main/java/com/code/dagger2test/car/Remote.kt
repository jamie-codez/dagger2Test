package com.code.dagger2test.car

import android.util.Log
import javax.inject.Inject

private const val TAG = "Remote"
class Remote @Inject constructor() {
 fun setListener(car: Car){
     Log.d(TAG, "Remote activated")
 }
}