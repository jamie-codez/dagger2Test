package com.code.dagger2test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject private lateinit var car:Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val carComponent = DaggerCarComponent.create()
//        car = carComponent.getCar()
        carComponent.inject(this@MainActivity)
        car.drive()
    }
}