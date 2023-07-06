package com.example.ktda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class SignupActivity : AppCompatActivity() {
    lateinit var myemail: EditText
    lateinit var mypassword: EditText
    lateinit var myconfpassword: EditText
    lateinit var signup:Button
    lateinit var mylogin:TextView
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        myemail=findViewById(R.id.myemail)
        mypassword=findViewById(R.id.pass)
        myconfpassword=findViewById(R.id.passs)
        signup=findViewById(R.id.signup)
        mylogin=findViewById(R.id.login)
        auth= Firebase.auth


        mylogin.setOnClickListener {
            val login=Intent(this,Employeelogin::class.java)
            startActivity(login)

        }

        signup.setOnClickListener {
            SignUpUser()
        }


    }
    private fun SignUpUser() {
        val email = myemail.text.toString()
        val pass = mypassword.text.toString()
        val confirmpass = myconfpassword.text.toString()
        if (email.isBlank() || pass.isBlank() || confirmpass.isBlank()) {
            Toast.makeText(this, "Please Email and Password can't be blank", Toast.LENGTH_LONG).show()
            return
        }
        else if (pass != confirmpass) {
            Toast.makeText(this, "Password does not match", Toast.LENGTH_LONG).show()
            return
        }
        auth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener {
            if (it.isSuccessful) {
                Toast.makeText(this, "Signed up successfully", Toast.LENGTH_LONG).show()

            }
            else {
                Toast.makeText(this, "Failed to signup", Toast.LENGTH_LONG).show()
            }
        }


    }
}