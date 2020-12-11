package com.ekapro.wisatajogjaeka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class BeritaActivity : AppCompatActivity() {

    lateinit var varweb1 : WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berita)
        fungsiWeb()
    }
    fun fungsiWeb(){

        varweb1 = findViewById(R.id.webku)
        varweb1.settings.javaScriptEnabled = true
        varweb1.loadUrl("http://arifekaprasetya.wordpress.com/")
       varweb1.webViewClient = object : WebViewClient(){

       }
    }
}