package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.myfirstapp.databinding.ActivityMainBinding

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

//    var txTest:TextView? = null
//
//    lateinit var bTest1:Button

// lesson 7-8
//    lateinit var bindingClass: ActivityMainBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        bindingClass = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(bindingClass.root)
//        bindingClass.bTest1.setOnClickListener {
//            bindingClass.txTest.text = "What yo wanna?"
//            bindingClass.bTest1.text = "Nigger!"
//        }
//        bindingClass.bTest2.setOnClickListener {
//            bindingClass.txTest3.visibility = View.INVISIBLE
//        }
////        bTest1 = findViewById(R.id.bTest1)
////        bTest1.setOnClickListener {
////            txTest = findViewById(R.id.txTest)
////            txTest?.text = "What your wanna?"
////            bTest1.text = "Nigger!"
////        }
//    }
//
//    fun onClickDtClick(view: View) {
//        var bTest2:Button = findViewById(R.id.bTest2)
//        bTest2.text = "Why you click?.."
//    }
//
//    fun onClickBm0(view: View) {
//
//    }

    lateinit var bindingClass: ActivityMainBinding

    val a:Short = 324
    val b:Byte = 54

    override fun onCreate(savedInstanceState: Bundle?) {
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bindingClass.root)

        bindingClass.bAdd.setOnClickListener {
            val result:Int = a + b
            bindingClass.textV.text = result.toString()
        }
        bindingClass.bSub.setOnClickListener {
            val result:Int = a - b
            bindingClass.textV.text = result.toString()
        }
        bindingClass.bUm.setOnClickListener {
            val result:Int = a * b
            bindingClass.textV.text = result.toString()
        }

    }
}