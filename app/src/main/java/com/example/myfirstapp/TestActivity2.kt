package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapp.databinding.ActivityTest2Binding

class TestActivity2 : AppCompatActivity() {

    lateinit var bindingClass: ActivityTest2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityTest2Binding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }



}