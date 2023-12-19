//package com.example.myfirstapp
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
//        val n = numbers[1]  // получаем второй элемент  n=2
//        numbers[1] = 2
//
//
//        val numbers1 = arrayOf(4, 9, 2, "array")
//        var number1 = numbers1[3]
//        numbers1[0] = 123
//
//        val numbers2 = IntArray(7)
//        val numbers3 = arrayOf(0, 0, 0, 0, 0, 0, 0)
//
//        val numbers4 = arrayOfNulls<Int>(5)
//
//        var numbers5 = emptyArray<String>()
//
//        numbers.reverse()
//        val reverseNumbers = numbers.reversedArray()
//
//        numbers.sort()
//        val sortedNumbers = numbers.sortedArray()
//
//        numbers.sortDescending()
//        val sortedDescending = numbers.sortedArrayDescending()
//
//        numbers.shuffle()
//
//        val numbersList = listOf(4, 5, 6, 7)
//        numbersList.sorted()
//        numbersList.sortedDescending()
//        numbersList.reversed()
//        numbersList.shuffled()
//        numbersList[0]
//        numbersList[numbersList.size - 2]
//
//        val numbersArrayList = arrayListOf(4, 5, 6, 7, 8, 9)
//        numbersArrayList.removeAt(1)
//        numbersArrayList[numbersArrayList.size - 1]
//        numbersArrayList.add(67)
//        numbersArrayList.clear()
//        numbersArrayList.addAll(numbers) //add list
//        numbersArrayList.addAll(numbers2.toList()) //add array
//
//
//    }
//
//}