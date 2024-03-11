package com.example.madlabexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class FoodDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_details)

        val logoutButton: ImageButton = findViewById(R.id.imageButton19)

        logoutButton.setOnClickListener {

            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)

        }

        val addToCartButton: Button = findViewById(R.id.button2)

        addToCartButton.setOnClickListener {

            val intent = Intent(this, CartActivity::class.java)
            startActivity(intent)

        }

        val BuyButton: Button = findViewById(R.id.button3)

        BuyButton.setOnClickListener {

            val intent = Intent(this, CheckoutActivity::class.java)
            startActivity(intent)

        }
    }
}