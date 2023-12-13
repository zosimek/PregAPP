package com.example.pregapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Info_Device_Number_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_device_number)

        val button1 = findViewById<Button>(R.id.page8_button1)
        button1.setOnClickListener{
            Toast.makeText(this, resources.getString(R.string.toast1), Toast.LENGTH_LONG).show()
            val page1 = Intent(applicationContext, StartActivity::class.java)
            startActivity(page1)
        }
    }
}