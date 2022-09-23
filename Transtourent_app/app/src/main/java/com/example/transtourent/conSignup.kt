package com.example.transtourent

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class conSignup : AppCompatActivity() {

    private lateinit var datepicker : TextView
    private lateinit var dateBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_con_signup)

        val signupbutton = findViewById<Button>(R.id.btn_signUp)
        signupbutton.setOnClickListener {
            val Intent = Intent(this, menu_nav::class.java)
            startActivity(Intent)
        }

        datepicker = findViewById(R.id.date)
        dateBtn = findViewById(R.id.datePickerBtn)

        val myCalendar = Calendar.getInstance()

        val datePicker = DatePickerDialog.OnDateSetListener{view, year, month, dayofMonth ->
            myCalendar.set(Calendar.YEAR, year)
            myCalendar.set(Calendar.MONTH, month)
            myCalendar.set(Calendar.DAY_OF_MONTH, dayofMonth)
            updateLable(myCalendar)

        }

        dateBtn.setOnClickListener {
            DatePickerDialog(this, datePicker, myCalendar.get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                myCalendar.get(Calendar.DAY_OF_MONTH)).show()
        }



    }

    private fun updateLable(myCalendar: Calendar) {
        val myFormat = "dd-MM-yyyy"
        val sdf = SimpleDateFormat(myFormat, Locale.UK)
        dateBtn.setText(sdf.format(myCalendar.time))

    }
}