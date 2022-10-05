package com.code.dagger2test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.code.dagger2test.car.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val carComponent = DaggerCarComponent.create()
//        car = carComponent.getCar()
        carComponent.inject(this@MainActivity)
        car.drive()
    }
}