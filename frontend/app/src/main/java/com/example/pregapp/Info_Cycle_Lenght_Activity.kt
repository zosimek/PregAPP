package com.example.pregapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Info_Cycle_Lenght_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_cycle_lenght)

        val button1 = findViewById<Button>(R.id.page4_button1)
        button1.setOnClickListener{
            val page5 = Intent(applicationContext, Info_Period_Activity::class.java)
            startActivity(page5)
        }
    }
}