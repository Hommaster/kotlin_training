//package com.example.myfirstapp
//
//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.View
//import androidx.compose.ui.unit.Constraints
//import com.example.myfirstapp.constance.Constance
//import com.example.myfirstapp.databinding.MainActivityBinding
//
//class MainActivity2 : AppCompatActivity() {
//
//    lateinit var bindingClass: MainActivityBinding
//
//    private var login = "empty"
//    private var password = "empty"
//    private var name = "empty"
//    private var surname = "empty"
//    private var surname2 = "empty"
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        bindingClass = MainActivityBinding.inflate(layoutInflater)
//        setContentView(bindingClass.root)
//    }
//
//
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//
//        if(requestCode == Constance.REQUEST_CODE_SIGN_IN && data != null) {
//            val l = data.getStringExtra(Constance.LOGIN)
//            val p = data.getStringExtra(Constance.PASSWORD)
//            if(login == l && password == p) {
//                val textInfo = "$name $surname $surname2"
//                bindingClass.textUserInfo.text = textInfo
//                bindingClass.textUserInfo.visibility = View.VISIBLE
//
//                bindingClass.buttonReg.visibility = View.GONE
//                bindingClass.buttonSigIn.visibility = View.GONE
//                bindingClass.buttonLogOut.visibility = View.VISIBLE
//
//                bindingClass.errorNotFound.visibility = View.GONE
//            }
//            else {
//                bindingClass.errorNotFound.visibility = View.VISIBLE
//                bindingClass.textUserInfo.text = null
//                bindingClass.textUserInfo.visibility = View.GONE
//            }
//        }
//        else if(requestCode == Constance.REQUEST_CODE_SIGN_UP && data != null) {
//            login = data.getStringExtra(Constance.LOGIN)!!
//            name = data.getStringExtra(Constance.NAME)!!
//            password = data.getStringExtra(Constance.PASSWORD)!!
//            surname = data.getStringExtra(Constance.SURNAME)!!
//            surname2 = data.getStringExtra(Constance.SURNAME2)!!
//
//            val textInfo = "$name $surname $surname2"
//            bindingClass.textUserInfo.text = textInfo
//            bindingClass.textUserInfo.visibility = View.VISIBLE
//
//            bindingClass.errorNotFound.visibility = View.GONE
//
//            bindingClass.buttonReg.visibility = View.GONE
//            bindingClass.buttonSigIn.visibility = View.GONE
//            bindingClass.buttonLogOut.visibility = View.VISIBLE
//
//        }
//    }
//
//    fun onClickSignIn(view: View) {
//        val intent = Intent(this, SignInActivity::class.java)
//        intent.putExtra(Constance.SIGN_STATE, Constance.SIGN_STATE_IN)
//        startActivityForResult(intent, Constance.REQUEST_CODE_SIGN_IN)
//    }
//
//    fun onClickSignUp(view: View) {
//
//        val intent = Intent(this, SignInActivity::class.java)
//        intent.putExtra(Constance.SIGN_STATE, Constance.SIGN_STATE_UP)
//        startActivityForResult(intent, Constance.REQUEST_CODE_SIGN_UP)
//
//    }
//
//    fun onClickLogOut(view: View) {
//        bindingClass.textUserInfo.text = null
//        bindingClass.textUserInfo.visibility = View.GONE
//
//        bindingClass.buttonReg.visibility = View.VISIBLE
//        bindingClass.buttonSigIn.visibility = View.VISIBLE
//        bindingClass.buttonLogOut.visibility = View.GONE
//    }
//
//}