package com.example.ktda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Products : AppCompatActivity() {
    lateinit var tea:ImageView
    lateinit var tea1:ImageView
    lateinit var tea2:ImageView
    lateinit var tea3:ImageView
    lateinit var tea4:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        tea=findViewById(R.id.med)
        tea1=findViewById(R.id.fit)
        tea2=findViewById(R.id.taste)
        tea3=findViewById(R.id.sleep)
        tea4=findViewById(R.id.pain)

        tea.setOnClickListener {
            val myintent= Intent(this,customer::class.java)
            startActivity(myintent)
        }
        tea1.setOnClickListener {
            val myintent = Intent(this, customer::class.java)
            startActivity(myintent)
        }
        tea2.setOnClickListener {
            val myintent = Intent(this, customer::class.java)
            startActivity(myintent)
        }
        tea3.setOnClickListener {
            val myintent = Intent(this, customer::class.java)
            startActivity(myintent)
        }
        tea4.setOnClickListener {
            val myintent = Intent(this, customer::class.java)
            startActivity(myintent)
        }
    }
}