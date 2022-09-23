package com.example.transtourent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView


class van : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_van)

        val drawerLayout : DrawerLayout = findViewById(R.id.drawerLayout)
        val navView : NavigationView = findViewById(R.id.nav_view)

        val signupbutton = findViewById<Button>(R.id.viewdatails1)
        signupbutton.setOnClickListener {
            val Intent = Intent(this, viewdetails::class.java)
            startActivity(Intent)
        }
        val signupbutton1 = findViewById<Button>(R.id.viewdatails2)
        signupbutton1.setOnClickListener {
            val Intent = Intent(this, viewdetails::class.java)
            startActivity(Intent)
        }
        val signupbutton2 = findViewById<Button>(R.id.viewdatails3)
        signupbutton2.setOnClickListener {
            val Intent = Intent(this, viewdetails::class.java)
            startActivity(Intent)
        }



        val signupbutton3 = findViewById<Button>(R.id.booknow1)
        signupbutton3.setOnClickListener {
            val Intent = Intent(this, booknow::class.java)
            startActivity(Intent)
        }
        val signupbutton4 = findViewById<Button>(R.id.booknow2)
        signupbutton4.setOnClickListener {
            val Intent = Intent(this, booknow::class.java)
            startActivity(Intent)
        }
        val signupbutton5 = findViewById<Button>(R.id.booknow2)
        signupbutton5.setOnClickListener {
            val Intent = Intent(this, booknow::class.java)
            startActivity(Intent)
        }

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.profile -> Toast.makeText(applicationContext, "clicked", Toast.LENGTH_SHORT).show()
                R.id.home -> Toast.makeText(applicationContext, "clicked", Toast.LENGTH_SHORT).show()
                R.id.vehicle -> Toast.makeText(applicationContext, "clicked", Toast.LENGTH_SHORT).show()
                R.id.booking -> Toast.makeText(applicationContext, "clicked", Toast.LENGTH_SHORT).show()
                R.id.payment -> Toast.makeText(applicationContext, "clicked", Toast.LENGTH_SHORT).show()
                R.id.logout -> Toast.makeText(applicationContext, "clicked", Toast.LENGTH_SHORT).show()

            }
            true
        }

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}