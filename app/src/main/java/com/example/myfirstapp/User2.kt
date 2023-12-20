package com.example.myfirstapp

import android.util.Log

class User2(var name : String, var id : String, var age: Int) {

    fun addAge(years: Int) {
        age = age.plus(years)
    }

    fun printInfo() {
        Log.d("My log3","Имя: $name ID: $id Возраст: $age")
    }

}