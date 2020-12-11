package com.ekapro.wisatajogjaeka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {

    lateinit var kendali : Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        kendali = Handler()
        kendali.postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            this@SplashScreen.finish()
        }, 3000)
        }
    }
