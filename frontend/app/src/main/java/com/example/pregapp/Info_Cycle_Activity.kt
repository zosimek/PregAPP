package com.example.pregapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Info_Cycle_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_cycle)

        val button1 = findViewById<ImageButton>(R.id.page3_button1)
        button1.setOnClickListener{
            val page4 = Intent(applicationContext, Info_Cycle_Lenght_Activity::class.java)
            startActivity(page4)
        }
        val button2 = findViewById<ImageButton>(R.id.page3_button2)
        button2.setOnClickListener{
            val page5 = Intent(applicationContext, Info_Period_Activity::class.java)
            startActivity(page5)
        }
    }
}