package com.example.pregapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Info_Period_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_period)

        val button1 = findViewById<ImageButton>(R.id.page5_button1)
        button1.setOnClickListener{
            val page6 = Intent(applicationContext, Info_Period_Lenght_Activity::class.java)
            startActivity(page6)
        }
        val button2 = findViewById<ImageButton>(R.id.page5_button2)
        button2.setOnClickListener{
            val page7 = Intent(applicationContext, Info_Device_Activity::class.java)
            startActivity(page7)
        }
    }
}