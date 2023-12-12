package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfirstapp.databinding.MainActivityBinding

class MainActivity2 : AppCompatActivity() {

    lateinit var bindingClass: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = MainActivityBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }
}