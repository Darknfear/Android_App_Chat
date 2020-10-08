package com.example.appchat.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.*
import com.example.appchat.R

class LoginActivity : AppCompatActivity() {
    private var btnLogin : Button ?= null
    private var txtRegister : TextView ?= null
    private var txtForget : TextView ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)
        setView()
        onClick()
    }

    fun setView() {
        btnLogin = findViewById<Button>(R.id.btn_login)
        txtForget = findViewById<TextView>(R.id.txt_forget)
        txtRegister = findViewById<TextView>(R.id.txt_register)
    }
    fun onClick() {
        btnLogin!!.setOnClickListener{
            Toast.makeText(applicationContext, "Hello World", Toast.LENGTH_LONG).show()
        }

        txtRegister!!.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }


}