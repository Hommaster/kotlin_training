package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var counter = "Hi!"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        counter = "Nigger"
    }

    fun onClick(view: View) {
        val bTest1 = findViewById<Button>(R.id.bTest1)
        bTest1.text = "hello"
    }
}