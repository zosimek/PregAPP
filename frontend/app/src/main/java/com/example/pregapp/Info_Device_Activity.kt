package com.example.pregapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class Info_Device_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_device)

        val button1 = findViewById<ImageButton>(R.id.page7_button1)
        button1.setOnClickListener{
            val page8 = Intent(applicationContext, Info_Device_Number_Activity::class.java)
            startActivity(page8)
        }
        val button2 = findViewById<ImageButton>(R.id.page7_button2)
        button2.setOnClickListener{
            Toast.makeText(this, resources.getString(R.string.toast1), Toast.LENGTH_LONG).show()
            val page1 = Intent(applicationContext, StartActivity::class.java)
            startActivity(page1)
        }
    }
}