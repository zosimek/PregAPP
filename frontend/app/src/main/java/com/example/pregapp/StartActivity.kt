package com.example.pregapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val button1 = findViewById<Button>(R.id.page1_button1)
        button1.setOnClickListener{
            val page9 = Intent(applicationContext, Log_In_Activity::class.java)
            startActivity(page9)
        }
        val button2 = findViewById<Button>(R.id.page1_button2)
        button2.setOnClickListener{
            val page2 = Intent(applicationContext, Registration_Activity::class.java)
            startActivity(page2)
        }
    }
}