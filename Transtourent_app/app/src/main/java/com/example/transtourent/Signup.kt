package com.example.transtourent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val signupbutton = findViewById<Button>(R.id.btn_next)
        signupbutton.setOnClickListener {
            val Intent = Intent(this, conSignup::class.java)
            startActivity(Intent)
        }
    }
}