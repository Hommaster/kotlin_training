package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.compose.ui.unit.Constraints
import com.example.myfirstapp.constance.Constance
import com.example.myfirstapp.databinding.MainActivityBinding

class MainActivity2 : AppCompatActivity() {

    lateinit var bindingClass: MainActivityBinding

    private var login = "empty"
    private var password = "empty"
    private var name = "empty"
    private var surname = "empty"
    private var surname2 = "empty"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = MainActivityBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == Constance.REQUEST_CODE_SIGN_IN) {

        }
        else if(requestCode == Constance.REQUEST_CODE_SIGN_UP) {

        }
    }

    fun onClickSignIn(view: View) {
        val intent = Intent(this, SignInActivity::class.java)
        intent.putExtra(Constance.SIGN_STATE, Constance.SIGN_STATE_IN)
        startActivityForResult(intent, Constance.REQUEST_CODE_SIGN_IN)
    }

    fun onClickSignUp(view: View) {

        val intent = Intent(this, SignInActivity::class.java)
        intent.putExtra(Constance.SIGN_STATE, Constance.SIGN_STATE_UP)
        startActivityForResult(intent, Constance.REQUEST_CODE_SIGN_UP)

    }

}