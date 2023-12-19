package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass: ActivityMainBinding

    val duesArray = arrayOf(1000, 900, 700, 2100, 500)
    val profitArray = arrayOf(2100, 700, 1100, 3300, 550)
    var resultListArray = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val name = resources.getStringArray(R.array.names)
        for((index, name) in name.withIndex()){

            resultListArray.add("Name: $name Profit: ${duesArray[index] - profitArray[index]}")
            bindingClass.resultList.text = resultListArray[index]
        }
    }
}