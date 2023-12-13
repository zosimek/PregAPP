package com.example.pregapp

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ProgressBar
import androidx.core.content.ContextCompat

class Main_Activity : AppCompatActivity() {

    private var cycleLength = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val icon1 = findViewById<ImageButton>(R.id.btn_temperature)
        icon1.setOnClickListener{
            val mainActivity = Intent(applicationContext, Temperature_Activity::class.java)
            startActivity(mainActivity)
        }

        val icon2 = findViewById<ImageButton>(R.id.btn_main)
        icon2.setOnClickListener{
            val mainActivity = Intent(applicationContext, Main_Activity::class.java)
            startActivity(mainActivity)
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


        cycleLength = 26
        val progressBar = findViewById<ProgressBar>(R.id.cycle_progress_bar)
        progressBar.max = cycleLength

        // Ustaw kolor progress baru na podstawie aktualnej wartości postępu
        progressBar.setProgress(22)
    }

    @SuppressLint("MissingSuperCall")
    override fun onBackPressed() {
    }
}