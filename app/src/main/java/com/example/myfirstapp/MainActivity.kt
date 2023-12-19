package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val arrayFruits = listOf<String>("apple", "mango", "orange")

        for(index in 0..2) {
            Log.d("My Log", "Index ${arrayFruits[index]}")
        }

        for(index in arrayFruits.indices) {
            Log.d("My log2", "Fruit ${arrayFruits[index]}")
        }

        for((index, item) in arrayFruits.withIndex()) {
            Log.d("My log3", "Index $index | Item $item")
        }

        for(index in 10 downTo 4){
            Log.d("My log4", "Index $index")
        }



    }

}