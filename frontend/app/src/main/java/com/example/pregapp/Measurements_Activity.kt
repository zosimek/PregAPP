package com.example.pregapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Measurements_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_measurements)


        val btn_measurements = findViewById<Button>(R.id.btm_measure_temperature)
        btn_measurements.setOnClickListener {
            val measurements_page = Intent(applicationContext, Measure_Temperature_Activity::class.java)
            startActivity(measurements_page)
        }
        val btn_data_graph = findViewById<Button>(R.id.btm_measure_saturation)
        btn_data_graph.setOnClickListener {
            val data_graph_page = Intent(applicationContext, Measure_Saturation_Activity::class.java)
            startActivity(data_graph_page)
        }
        val btn_authorised_person = findViewById<Button>(R.id.btm_graph)
        btn_authorised_person.setOnClickListener {
            val authorised_person_page = Intent(applicationContext, Data_Graph_Activity::class.java)
            startActivity(authorised_person_page)
        }


        val icon1 = findViewById<ImageButton>(R.id.btn_temperature)
        icon1.setOnClickListener{
            val page10 = Intent(applicationContext, Measurements_Activity::class.java)
            startActivity(page10)
        }
        val icon2 = findViewById<ImageButton>(R.id.btn_main)
        icon2.setOnClickListener{
            val page11 = Intent(applicationContext, Main_Activity::class.java)
            startActivity(page11)
        }
        val icon3 = findViewById<ImageButton>(R.id.btn_calendar)
        icon3.setOnClickListener{
            val page12 = Intent(applicationContext, Calendar_Activity::class.java)
            startActivity(page12)
        }
        val icon4 = findViewById<ImageButton>(R.id.btn_personal_info)
        icon4.setOnClickListener{
            val page13 = Intent(applicationContext, Personal_Info_Activity::class.java)
            startActivity(page13)
        }
        val icon5 = findViewById<ImageButton>(R.id.btn_labor)
        icon5.setOnClickListener{
            val laborActivity = Intent(applicationContext, Labor_Activity::class.java)
            startActivity(laborActivity)
        }
    }

    @SuppressLint("MissingSuperCall")
    override fun onBackPressed() {
    }
}