package com.example.pregapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Info_Period_Lenght_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_period_lenght)

        val button1 = findViewById<Button>(R.id.page6_button13)
        button1.setOnClickListener{
            val page7 = Intent(applicationContext, Info_Device_Activity::class.java)
            startActivity(page7)
        }
    }
}