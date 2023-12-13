package com.example.pregapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Settings_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val icon1 = findViewById<ImageButton>(R.id.btn_temperature)
        icon1.setOnClickListener{
            val page10 = Intent(applicationContext, Temperature_Activity::class.java)
            startActivity(page10)
        }
        val icon2 = findViewById<ImageButton>(R.id.btn_main)
        icon2.setOnClickListener{
            val page11 = Intent(applicationContext, Main_Activity::class.java)
            startActivity(page11)
        }
        val icon3 = findViewById<ImageButton>(R.id.btn_calendar)
        icon3.setOnClickListener{
            val page12 = Intent(applicationContext, Calendar_Activity::class.java)
            startActivity(page12)
        }
        val icon4 = findViewById<ImageButton>(R.id.btn_personal_info)
        icon4.setOnClickListener{
            val page13 = Intent(applicationContext, Personal_Info_Activity::class.java)
            startActivity(page13)
        }
        val icon5 = findViewById<ImageButton>(R.id.btn_labor)
        icon5.setOnClickListener{
            val laborActivity = Intent(applicationContext, Labor_Activity::class.java)
            startActivity(laborActivity)
        }
    }

    @SuppressLint("MissingSuperCall")
    override fun onBackPressed() {
    }
}