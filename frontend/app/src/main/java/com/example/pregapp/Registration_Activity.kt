package com.example.pregapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Registration_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val button1 = findViewById<Button>(R.id.page2_button1)
        button1.setOnClickListener{
            val page3 = Intent(applicationContext, Info_Cycle_Activity::class.java)
            startActivity(page3)
        }
    }
}