package com.example.ktda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    lateinit var emp:Button
    lateinit var cus:Button
    lateinit var about:TextView
    lateinit var contact:TextView
    lateinit var services:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        emp=findViewById(R.id.employee)
        cus=findViewById(R.id.customer)
        about=findViewById(R.id.abt)
        contact=findViewById(R.id.con)
        services=findViewById(R.id.ser)



        emp.setOnClickListener {
            val mybtn= Intent(this, SignupActivity::class.java)
            startActivity(mybtn)
        }
        cus.setOnClickListener {
            val mybtn= Intent(this, CustomerSignUp::class.java)
            startActivity(mybtn)
        }
        about.setOnClickListener {
            val mybtn= Intent(this, About::class.java)
            startActivity(mybtn)
        }

        contact.setOnClickListener {
            val mybtn= Intent(this, Contactpage::class.java)
            startActivity(mybtn)
        }

        services.setOnClickListener {
            val mybtn= Intent(this, Servicespage::class.java)
            startActivity(mybtn)
        }

    }
}