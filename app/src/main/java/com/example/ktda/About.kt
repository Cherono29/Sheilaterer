package com.example.ktda

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class About : AppCompatActivity() {
    lateinit var fb:TextView
    lateinit var insta:TextView
    lateinit var tweet:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        fb=findViewById(R.id.fb)
        insta=findViewById(R.id.insta)
        tweet=findViewById(R.id.twitter)

        fb.setOnClickListener {
            val browserintent=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100094238439879"))
            startActivity(browserintent)
        }
        insta.setOnClickListener {
            val browserintent=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/ktda_management/"))
            startActivity(browserintent)
        }
        fb.setOnClickListener {
            val browserintent=Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/sheeterer"))
            startActivity(browserintent)
        }
    }
}