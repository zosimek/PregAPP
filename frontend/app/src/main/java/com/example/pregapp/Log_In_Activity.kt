package com.example.pregapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Log_In_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        val button1 = findViewById<Button>(R.id.page9_button1)
        button1.setOnClickListener{
            val page10 = Intent(applicationContext, Main_Activity::class.java)
            startActivity(page10)
        }
    }
}