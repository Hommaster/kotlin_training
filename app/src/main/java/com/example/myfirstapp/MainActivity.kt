package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

//    var counter1:Byte = 127
//    var int:Int = 2147483647
//    var short:Short = 32767
//    var long:Long = 2147483647777777777
//
//    var float:Float = 127.0f
//    var double:Double = 2.14748364777777766E18
//
//    var boolean: Boolean = true
//    var boolean1:Boolean = false
//
//    var testChar:Char = '1'
//
//    var testString:String = "ilya.pan.2017@mail.ru"

    var txTest:TextView? = null

    lateinit var bTest1:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bTest1 = findViewById(R.id.bTest1)
        bTest1.setOnClickListener {
            txTest = findViewById(R.id.txTest)
            txTest?.text = "What your wanna?"
            bTest1.text = "Nigger!"
        }
    }

    fun onClickDtClick(view: View) {
        var bTest2:Button = findViewById(R.id.bTest2)
        bTest2.text = "Why you click?.."
    }

    fun onClickBm0(view: View) {

    }
}