package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myfirstapp.constance.Constance
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

//    lateinit var bindingClass: ActivityMainBinding
//
//    val a:Byte = 90
//    val b:Byte = 36
//
//    var maxPerson:Byte = 90
//    val currentPerson:Byte = 36
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        bindingClass = ActivityMainBinding.inflate(layoutInflater)
//        super.onCreate(savedInstanceState)
//        setContentView(bindingClass.root)
//
//        bindingClass.bAdd.setOnClickListener {
//            val result:Int = a + b
//            bindingClass.textV.text = "Результат сложения равен: $result"
//        }
//        bindingClass.bSub.setOnClickListener {
//            val result:Int = a - b
//            bindingClass.textV.text = "Результат вычитания равен: $result"
//        }
//        bindingClass.bUm.setOnClickListener {
//            val result:Int = a * b
//            bindingClass.textV.text = "Результат умножения равен: $result"
//        }
//
//        bindingClass.bSr.setOnClickListener {
////            if (maxPerson > currentPerson) bindingClass.txSr.text = "Кол-во людей не превышает требованиям"
////            else bindingClass.txSr.text = "Кол-во людей превышено!"
////            bindingClass.txSr.visibility = View.VISIBLE
//
////            bindingClass.txSr.text = if (maxPerson > currentPerson) "Все впорядке" else "Превышено кол-во людей!"
////            bindingClass.txSr.visibility = View.VISIBLE
//
//            if (maxPerson > currentPerson) {
//                bindingClass.txSr.text = "All Good, man"
//                bindingClass.txSr.setBackgroundColor(Color.GREEN)
//            }
//            else {
//                bindingClass.txSr.text = "Not  good! Your woomen!?"
//                bindingClass.txSr.setBackgroundColor(Color.RED)
//            }
//            bindingClass.txSr.visibility = View.VISIBLE
//
////            bindingClass.textView2.text = when(currentPerson) {
////                in 0..maxPerson -> "All Good"
////                else -> "Not Good!!"
////            }
//
//            when(maxPerson > currentPerson) {
//                true -> bindingClass.bSr.setTextColor(Color.GREEN)
//                else -> bindingClass.bSr.setTextColor(Color.RED)
//            }
//
//            when(currentPerson) {
//                in 0..maxPerson -> {
//                    bindingClass.textView2.text = "Колво людей не превышено"
//                    bindingClass.textView2.setBackgroundColor(Color.GREEN)
//                }
//                else -> {
//                    bindingClass.textView2.text = "Людей больше допустимого значения!!"
//                    bindingClass.textView2.setBackgroundColor(Color.YELLOW)
//                }
//
//            }
//        }
//    }

    lateinit var bindingClass: ActivityMainBinding

//    val little:Int = 500
//    val malo:Int = 1000
//    val middle:Int = 10000
//    val senior:Int = 100000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

//            val result:Int = bindingClass.edValue.text.toString().toInt()
//
//            bindingClass.txResult.visibility = View.VISIBLE
//
//            when(result) {
//                in 0..little -> {
//                    bindingClass.txResult.setTextColor(Color.RED)
//                    bindingClass.txResult.text = "Нулевый"
//                }
//                in little..malo -> {
//                    bindingClass.txResult.setTextColor(Color.YELLOW)
//                    bindingClass.txResult.text = "Мало подписчиков"
//                }
//                in malo..middle -> {
//                    bindingClass.txResult.setTextColor(Color.GREEN)
//                    bindingClass.txResult.text = "Сойдет для начала"
//                }
//                in middle..senior -> {
//                    bindingClass.txResult.text = "А ты хорош"
//                    bindingClass.txResult.setTextColor(Color.BLUE)
//                }

//            val resultName = bindingClass.edValue.text.toString()
//
//            val resultPassword:Int = bindingClass.edValuePassword.text.toString().toInt()
//
//            bindingClass.txResult.visibility = View.VISIBLE
//
//            when(resultName) {
//                Constance.Dvornik -> {
//                    val tempText = "Получите ваши ${Constance.DvornikSalary}"
//                    if(resultPassword == Constance.Dvornik_Password) {
//                        bindingClass.txResult.text = tempText
//                        bindingClass.imageIcon.setImageResource(Constance.Dvornik_Image.toInt())
//                    }
//                    else {
//                        bindingClass.txResult.text = "Неверно введен пароль"
//                        bindingClass.imageIcon.setImageResource(R.drawable.fortune)
//                    }
//                    bindingClass.imageIcon.visibility = View.VISIBLE
//                }
//                Constance.Enginier -> {
//                    val tempText = "Получите ваши ${Constance.EnginierSalary}"
//                    if(resultPassword == Constance.Enginier_Password) {
//                        bindingClass.txResult.text = tempText
//                        bindingClass.imageIcon.setImageResource(Constance.Enginier_Image.toInt())
//                    }
//                    else {
//                        bindingClass.txResult.text = "Неверно введен пароль"
//                        bindingClass.imageIcon.setImageResource(R.drawable.fortune)
//                    }
//                    bindingClass.imageIcon.visibility = View.VISIBLE
//                }
//                Constance.Director -> {
//                    val tempText = "Получите ваши ${Constance.DirectorSalary}"
//                    if(resultPassword == Constance.Diresctor_Password) {
//                        bindingClass.txResult.text = tempText
//                        bindingClass.imageIcon.setImageResource(Constance.Director_Image.toInt())
//                    }
//                    else {
//                        bindingClass.txResult.text = "Неверно введен пароль"
//                        bindingClass.imageIcon.setImageResource(R.drawable.fortune)
//                    }
//                    bindingClass.imageIcon.visibility = View.VISIBLE
//                }
//                else -> bindingClass.txResult.text = "Работник не найден в базе данных"
//            }
//
//            }
    }

    fun onClickGoTestActivity1(view : View) {
        val intent = Intent(this, TestActivity1::class.java)
        startActivity(intent)
    }

    fun onClickClose(view: View) {
        finish()
    }

}