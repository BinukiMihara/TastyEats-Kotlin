package com.example.madlabexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val signInButton: Button = findViewById(R.id.btnSignup)

        signInButton.setOnClickListener {

            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)

        }
    }
}