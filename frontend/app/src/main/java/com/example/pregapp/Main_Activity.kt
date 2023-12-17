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

        val btn_settings = findViewById<ImageButton>(R.id.btn_settings)
        btn_settings.setOnClickListener {
            val settingsActivity = Intent(applicationContext, Settings_Activity::class.java)
            startActivity(settingsActivity)
        }

        val btn_temperature = findViewById<ImageButton>(R.id.btn_temperature)
        btn_temperature.setOnClickListener{
            val mainActivity = Intent(applicationContext, Temperature_Activity::class.java)
            startActivity(mainActivity)
        }

        val btn_main = findViewById<ImageButton>(R.id.btn_main)
        btn_main.setOnClickListener{
            val mainActivity = Intent(applicationContext, Main_Activity::class.java)
            startActivity(mainActivity)
        }
        val btn_calendar = findViewById<ImageButton>(R.id.btn_calendar)
        btn_calendar.setOnClickListener{
            val page12 = Intent(applicationContext, Calendar_Activity::class.java)
            startActivity(page12)
        }
        val btn_personal_info = findViewById<ImageButton>(R.id.btn_personal_info)
        btn_personal_info.setOnClickListener{
            val page13 = Intent(applicationContext, Personal_Info_Activity::class.java)
            startActivity(page13)
        }
        val btn_labor = findViewById<ImageButton>(R.id.btn_labor)
        btn_labor.setOnClickListener{
            val laborActivity = Intent(applicationContext, Labor_Activity::class.java)
            startActivity(laborActivity)
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