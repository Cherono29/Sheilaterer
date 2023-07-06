package com.example.ktda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class Employeelogin : AppCompatActivity() {

    lateinit var login: Button
    lateinit var signup: TextView
    lateinit var myemail: TextView
    lateinit var pass: EditText
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employeelogin)


        myemail=findViewById(R.id.email)
        pass=findViewById(R.id.password)
        login=findViewById(R.id.login)
        signup=findViewById(R.id.signup)
        auth= FirebaseAuth.getInstance()

        signup.setOnClickListener {
            val intent=Intent(this,SignupActivity::class.java)
            startActivity(intent)
        }


        login.setOnClickListener {
           login()
        }

    }
    private fun login(){
        val email=myemail.text.toString()
        val pass=pass.text.toString()

        auth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(this) {
            if (it.isSuccessful) {
                Toast.makeText(this, "Successfully Logged in", Toast.LENGTH_LONG).show()
                val intent = Intent(this, allActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Unable to login", Toast.LENGTH_LONG).show()
            }
        }



    }
}