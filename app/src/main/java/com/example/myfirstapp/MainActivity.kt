package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
        val n = numbers[1]  // получаем второй элемент  n=2
        numbers[1] = 2


        val numbers1 = arrayOf(4, 9, 2, "array")
        var number1 = numbers1[3]
        numbers1[0] = 123

        val numbers2 = IntArray(7)
        val numbers3 = arrayOf(0, 0, 0, 0, 0, 0, 0)

        val numbers4 = arrayOfNulls<Int>(5)

        var numbers5 = emptyArray<String>()

    }

}