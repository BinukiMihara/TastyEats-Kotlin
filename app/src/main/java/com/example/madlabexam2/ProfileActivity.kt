package com.example.madlabexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val logoutButton: Button = findViewById(R.id.btnlogout)

        logoutButton.setOnClickListener {

            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)

        }
    }
}