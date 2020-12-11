package com.ekapro.wisatajogjaeka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class LinkVideo : AppCompatActivity() {

    lateinit var linkVideo1 : Button
    lateinit var linkVideo2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_link_video)

        linkVideo1 = findViewById(R.id.tombolVideo1)
        linkVideo1.setOnClickListener(){
            startActivity(Intent(this,LinkVideo1Activity::class.java))
        }

        linkVideo2 = findViewById(R.id.tombolVideo2)
        linkVideo2.setOnClickListener(){
            startActivity(Intent(this,LinkVideo2Activity::class.java))
        }

    }
}