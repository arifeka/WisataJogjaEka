package com.ekapro.wisatajogjaeka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class TentangActivity : AppCompatActivity() {

    lateinit var pict : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tentang)

        pict = findViewById(R.id.GambarProfil)
        pict.setOnClickListener(){
            Toast.makeText(this, "Ini adalah gambar about", Toast.LENGTH_LONG).show()
        }
    }
}