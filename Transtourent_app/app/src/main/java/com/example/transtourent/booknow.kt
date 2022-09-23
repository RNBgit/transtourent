package com.example.transtourent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class booknow : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booknow)

        val loginbutton = findViewById<Button>(R.id.btn_signUp)
        loginbutton.setOnClickListener {
            val Intent = Intent(this, menu_nav::class.java)
            startActivity(Intent)
        }
    }
}