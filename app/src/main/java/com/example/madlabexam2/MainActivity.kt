package com.example.madlabexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager

class MainActivity : AppCompatActivity() {

    private var SPLASH_SCREEN_TIME : Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_main)

        Handler(Looper.myLooper()!!).postDelayed({
            startActivity(Intent(this, SignInActivity::class.java))
            finish()
        }, SPLASH_SCREEN_TIME)
    }
}