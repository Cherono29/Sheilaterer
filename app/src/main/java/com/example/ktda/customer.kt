package com.example.ktda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class customer : AppCompatActivity() {
    lateinit var mpesa:Button
    lateinit var cash:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer)

        mpesa=findViewById(R.id.mpesa)
        cash=findViewById(R.id.cash)

        mpesa.setOnClickListener {
            val simToolKitLaunchIntent=applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }
        }
        cash.setOnClickListener {
            Toast.makeText(applicationContext,"Your order has been placed", Toast.LENGTH_LONG).show()
        }
    }
}