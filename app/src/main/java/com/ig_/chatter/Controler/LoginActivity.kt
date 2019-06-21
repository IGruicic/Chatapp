package com.ig_.chatter.Controler

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ig_.chatter.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun loginALBtnClc(view: View){

    }

    fun signUpALBtn(view: View){
       val signinIntent = Intent(this, CreateUserActivity::class.java)
        startActivity(signinIntent)
    }
}
