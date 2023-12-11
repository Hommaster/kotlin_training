package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfirstapp.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {

    lateinit var bindingClass : Activity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = Activity2Binding.inflate(layoutInflater)
        setContentView(R.layout.activity_2)
        bindingClass.txTest.text = "Hellow Bitch"
    }
}