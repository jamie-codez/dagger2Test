package com.code.dagger2test

import javax.inject.Inject

class Wheels @Inject constructor(val rims:Rim,val tire:Tire) {
    /*** We do not own this class and hence cant annotate it with @Inject
     *
     */
}