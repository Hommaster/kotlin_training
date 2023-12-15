//package com.example.myfirstapp
//
//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.View
//import com.example.myfirstapp.constance.Constance
//import com.example.myfirstapp.databinding.ActivitySignInBinding
//
//class SignInActivity : AppCompatActivity() {
//
//    lateinit var bindingClass: ActivitySignInBinding
//    private var signState = "empty"
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        bindingClass = ActivitySignInBinding.inflate(layoutInflater)
//        setContentView(bindingClass.root)
//
//        signState = intent.getStringExtra(Constance.SIGN_STATE)!!
//
//        if (signState == Constance.SIGN_STATE_IN) {
//
//            bindingClass.labelName.visibility = View.GONE
//            bindingClass.labelSurname.visibility = View.GONE
//            bindingClass.labelSurname2.visibility = View.GONE
//
//        } else if (signState == Constance.SIGN_STATE_UP) {
//
//        }
//    }
//
//    fun onClickDone(view: View) {
//        if (signState == Constance.SIGN_STATE_UP) {
//            val intent = Intent()
//            intent.putExtra(Constance.LOGIN, bindingClass.labelLogin.text.toString())
//            intent.putExtra(Constance.PASSWORD, bindingClass.labelPassword.text.toString())
//            intent.putExtra(Constance.NAME, bindingClass.labelName.text.toString())
//            intent.putExtra(Constance.SURNAME, bindingClass.labelSurname.text.toString())
//            intent.putExtra(Constance.SURNAME2, bindingClass.labelSurname2.text.toString())
//            setResult(RESULT_OK, intent)
//            finish()
//        }
//        else if(signState == Constance.SIGN_STATE_IN) {
//            val intent = Intent()
//            intent.putExtra(Constance.LOGIN, bindingClass.labelLogin.text.toString())
//            intent.putExtra(Constance.PASSWORD, bindingClass.labelPassword.text.toString())
//            setResult(RESULT_OK, intent)
//            finish()
//        }
//    }
//}