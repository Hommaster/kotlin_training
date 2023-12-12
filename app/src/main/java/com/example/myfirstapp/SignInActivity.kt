package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfirstapp.constance.Constance
import com.example.myfirstapp.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {

    lateinit var bindingClass: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val signState = intent.getStringExtra(Constance.SIGN_STATE)

        if(signState == Constance.SIGN_STATE_IN) {

        }
        else if(signState == Constance.SIGN_STATE_UP) {

        }
    }
}