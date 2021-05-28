package com.example.datetime

import android.app.TimePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.format.DateFormat
import android.util.Log
import android.view.View
import android.widget.*

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val t1=findViewById<TextView>(R.id.text1)
        val t11=findViewById<TextView>(R.id.t2)
        val but1=findViewById<Button>(R.id.b1)
        val timeZone=TimeZone.getTimeZone("Asia/Kolkata")
        val dateFormat=SimpleDateFormat("dd-MM-yyyy  hh:mm:ss a")
        dateFormat.setTimeZone(timeZone)
        val date=Date()
        var curr_date:String=dateFormat.format(date)
        t1.text=curr_date

        val timeAme=TimeZone.getTimeZone("America/Chicago")
        dateFormat.setTimeZone(timeAme)
        val curr_date1=dateFormat.format(date)

        val timeAmee=TimeZone.getTimeZone("Canada/Yukon")
        dateFormat.setTimeZone(timeAmee)
       val curr_date2=dateFormat.format(date)

        val timeAmeee=TimeZone.getTimeZone("Australia/Victoria")
        dateFormat.setTimeZone(timeAmeee)
        val curr_date3=dateFormat.format(date)

        val timeAmeee1=TimeZone.getTimeZone("Asia/Kuwait")
        dateFormat.setTimeZone(timeAmeee1)
        val curr_date4=dateFormat.format(date)


        val timeAmeee2=TimeZone.getTimeZone("Hongkong")
        dateFormat.setTimeZone(timeAmeee2)
        val curr_date5=dateFormat.format(date)


        val timezones = resources.getStringArray(R.array.timezones)


        val spinner = findViewById<Spinner>(R.id.spinner)
        if (spinner != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, timezones)
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    when (position) {
                        1 ->
                            t11.text = curr_date1+"America/Chicago"
                        2->
                            t11.text=curr_date2 +"Canada/Yukon"
                        3->
                            t11.text=curr_date3 +"Australia/Victoria"
                        4->
                            t11.text=curr_date4 +"Asia/Kuwait"
                        5->
                            t11.text=curr_date5 +"Hongkong"
                    }
                }
                override fun onNothingSelected(parent: AdapterView<*>) {

                }
            }
        }
        but1.setOnClickListener{
val intent=Intent(this,formats::class.java)
            startActivity(intent)
        }

    }
}