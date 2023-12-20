package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val user = User()
        user.name = "Ilya"
        user.id = "1222345"
        user.age = 31

        val user2 = User2("Ilya", "1234566", 25)
        user2.addAge(3)
        user2.printInfo()
    }
}