package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var duesArray = arrayOf(1000, 900, 700, 2100, 500)
    var profitArray = arrayOf(2100, 700, 1100, 3300, 550)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}