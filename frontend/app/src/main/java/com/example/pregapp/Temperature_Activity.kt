package com.example.pregapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Temperature_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal_info)

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
    }

    @SuppressLint("MissingSuperCall")
    override fun onBackPressed() {
    }
}