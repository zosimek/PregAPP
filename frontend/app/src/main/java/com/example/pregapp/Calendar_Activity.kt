package com.example.pregapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.Calendar

private var arrayList: ArrayList<CalendarItem>? = null
private var calendarAdapter: CalendarAdapter? = null

class Calendar_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        val icon1 = findViewById<ImageButton>(R.id.btn_temperature)
        icon1.setOnClickListener{
            val page10 = Intent(applicationContext, Temperature_Activity::class.java)
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

        val gridView = findViewById<GridView>(R.id.calendar_grid)
        arrayList = ArrayList()
        arrayList = setDataList()
        calendarAdapter = CalendarAdapter(applicationContext, arrayList!!)
        gridView.adapter = calendarAdapter

        addTime()
    }

    private fun addTime() {
        val currentDate = Calendar.getInstance()
        val year = currentDate.get(Calendar.YEAR)
        val month = currentDate.get(Calendar.MONTH)
        val day = currentDate.get(Calendar.DAY_OF_MONTH)
        val dayName = currentDate.get(Calendar.DAY_OF_WEEK)
        val yearValue = findViewById<TextView>(R.id.date_display_year)
        val monthValue = findViewById<TextView>(R.id.date_display_month)
        val dayValue = findViewById<TextView>(R.id.date_display_day)
        val dayNameValue = findViewById<TextView>(R.id.date_display_dayname)

        yearValue.text = year.toString()
        monthValue.text = nameOfMonth()[month]
        dayValue.text = day.toString()
        dayNameValue.text = dayOfWeek()[dayName]
    }

    private fun setDataList(): ArrayList<CalendarItem>? {
        val currentDate = Calendar.getInstance()
        val year = currentDate.get(Calendar.YEAR)
        val month = currentDate.get(Calendar.MONTH) + 1
        val fromDate = if(month < 10) "01/0$month/$year"
        else "01/$month/$year"

        val sdf = SimpleDateFormat("dd/MM/yyyy", java.util.Locale.ENGLISH)
        val date= sdf.parse(fromDate)
        sdf.applyPattern("EEE")
        val str = date?.let { sdf.format(it) }
        val arrayList: ArrayList<CalendarItem> = ArrayList()

        if(str == "Mon") {
            for (i in 1..31) {
                arrayList.add(CalendarItem(i))
            }
        }
        if(str == "Tue") {
            for (i in 1..1) {
                arrayList.add(CalendarItem(0))
            }
            for (i in 1..31) {
                arrayList.add(CalendarItem(i))
            }
        }
        if(str == "Wen") {
            for (i in 1..2) {
                arrayList.add(CalendarItem(0))
            }
            for (i in 1..31) {
                arrayList.add(CalendarItem(i))
            }
        }
        if(str == "Thu") {
            for (i in 1..3) {
                arrayList.add(CalendarItem(0))
            }
            for (i in 1..31) {
                arrayList.add(CalendarItem(i))
            }
        }
        if(str == "Fri") {
            for (i in 1..4) {
                arrayList.add(CalendarItem(0))
            }
            for (i in 1..31) {
                arrayList.add(CalendarItem(i))
            }
        }
        if(str == "Sat") {
            for (i in 1..5) {
                arrayList.add(CalendarItem(0))
            }
            for (i in 1..31) {
                arrayList.add(CalendarItem(i))
            }
        }
        if(str == "Sun") {
            for (i in 1..6) {
                arrayList.add(CalendarItem(0))
            }
            for (i in 1..31) {
                arrayList.add(CalendarItem(i))
            }
        }

        return arrayList
    }

    private fun dayOfWeek(): ArrayList<String> {
        val dayName: ArrayList<String> = ArrayList()
        dayName.add("Poniedziałek")
        dayName.add("Wtorek")
        dayName.add("Środa")
        dayName.add("Czwartek")
        dayName.add("Piątek")
        dayName.add("Sobota")
        dayName.add("Niedziela")
        return dayName
    }

    private fun nameOfMonth(): ArrayList<String> {
        val monthName: ArrayList<String> = ArrayList()
        monthName.add("Sty")
        monthName.add("Lut")
        monthName.add("Mar")
        monthName.add("Kwi")
        monthName.add("Maj")
        monthName.add("Cze")
        monthName.add("Lip")
        monthName.add("Sie")
        monthName.add("Wrz")
        monthName.add("Paź")
        monthName.add("Lis")
        monthName.add("Gru")
        return monthName
    }

    @SuppressLint("MissingSuperCall")
    override fun onBackPressed() {
    }
}