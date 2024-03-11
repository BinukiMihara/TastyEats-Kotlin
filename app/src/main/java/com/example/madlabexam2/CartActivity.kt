package com.example.madlabexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        val checkoutIcon: Button = findViewById(R.id.button5)

        checkoutIcon.setOnClickListener {

            val intent = Intent(this, CheckoutActivity::class.java)
            startActivity(intent)
        }
    }
}