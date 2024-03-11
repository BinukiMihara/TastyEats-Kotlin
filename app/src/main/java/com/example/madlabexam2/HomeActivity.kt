package com.example.madlabexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val cartIcon: ImageButton = findViewById(R.id.cart)
        val imageButton9 : ImageButton = findViewById(R.id.imageButton9)

        cartIcon.setOnClickListener {

            val intent = Intent(this, CartActivity::class.java)
            startActivity(intent)
        }

        imageButton9.setOnClickListener {
            val intent = Intent(this, FoodDetailsActivity::class.java)
            startActivity(intent)
        }

            val signInButton: ImageButton = findViewById(R.id.SearchBtn)

            signInButton.setOnClickListener {

                val intent = Intent(this, CartActivity::class.java)
                startActivity(intent)
            }
        val profileButton: ImageButton = findViewById(R.id.imageButton39)

        profileButton.setOnClickListener {

            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}