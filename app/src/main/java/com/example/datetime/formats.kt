package com.example.datetime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class formats : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formats)
        val t11=findViewById<TextView>(R.id.t1)
        val t33=findViewById<TextView>(R.id.t3)
        val t44=findViewById<TextView>(R.id.t4)
        val t55=findViewById<TextView>(R.id.t5)
        val t66=findViewById<TextView>(R.id.t6)
        val dateFormat= SimpleDateFormat("dd-MM-yyy EEEE  hh:mm:ss a")
        val date= Date()
        val curr_date:String=dateFormat.format(date)
        t11.text=curr_date
        val dateFormat1= SimpleDateFormat("EEE, MMM d, ''yy")
        val date1= Date()
        val curr_date1:String=dateFormat1.format(date1)
        t33.text=curr_date1
        val dateFormat2= SimpleDateFormat("d-MM-y  H:mm:ss ")
        val date2= Date()
        val curr_date2:String=dateFormat2.format(date2)
        t44.text=curr_date2

        val dateFormat3= SimpleDateFormat("hh'o''clock' :mm a, zzzz ")
        val date3= Date()
        val curr_date3:String=dateFormat3.format(date3)
        t55.text=curr_date3


        val dateFormat4= SimpleDateFormat(" dd MMMM yyyy hh:m a")
        val date4= Date()
        val curr_date4:String=dateFormat4.format(date4)
        t66.text=curr_date4
    }
}