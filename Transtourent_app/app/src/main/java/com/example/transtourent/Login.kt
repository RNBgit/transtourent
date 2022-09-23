package com.example.transtourent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val signupbutton = findViewById<Button>(R.id.btn_signup)
        signupbutton.setOnClickListener {
            val Intent = Intent(this, Signup::class.java)
            startActivity(Intent)
        }

        val loginbutton = findViewById<Button>(R.id.btn_login)
        loginbutton.setOnClickListener {
            val Intent = Intent(this, menu_nav::class.java)
            startActivity(Intent)
        }
    }
}