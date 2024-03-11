package com.example.madlabexam2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat



class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        val signInButton: Button = findViewById(R.id.button)

        signInButton.setOnClickListener {

            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)



    }
    }
}