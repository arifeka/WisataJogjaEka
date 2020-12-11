package com.ekapro.wisatajogjaeka

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {
//    ini memanggil linear layout, karena yang akan kita panggil lateinit var isinya linear layout
    lateinit var menuHome : LinearLayout
    lateinit var menuBerita : LinearLayout
    lateinit var menuPeta : LinearLayout
    lateinit var menuGaleri : LinearLayout
    lateinit var menuTentang : LinearLayout
    lateinit var menuVideo : LinearLayout
    lateinit var linkVideo : LinearLayout

            override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        menuHome = findViewById(R.id.menu1)
        menuBerita = findViewById(R.id.menu2)
        menuPeta = findViewById(R.id.menu3)
        menuGaleri = findViewById(R.id.menu4)
        menuTentang = findViewById(R.id.menu5)
        menuVideo = findViewById(R.id.menu6)
        linkVideo = findViewById(R.id.menu7)

        menuHome.setOnClickListener(){
            startActivity(Intent(this,HomeActivity::class.java))
        }

        menuBerita.setOnClickListener(){
            startActivity(Intent(this,BeritaActivity::class.java))
        }

        menuPeta.setOnClickListener(){
            startActivity(Intent(this,PetaActivity::class.java))
        }

        menuGaleri.setOnClickListener(){
            startActivity(Intent(this,GaleriActivity::class.java))
        }

         menuTentang.setOnClickListener(){
             startActivity(Intent(this,TentangActivity::class.java))
         }

         menuVideo.setOnClickListener() {
             startActivity(Intent(this, VideoActivity::class.java))
         }


         linkVideo.setOnClickListener() {
               startActivity(Intent(this, LinkVideo::class.java))
         }


    }

    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setTitle("Keluar")
            .setMessage("Yakin Keluar dari Aplikasi?")
            .setPositiveButton("YA", DialogInterface.OnClickListener{dialog, which -> finishAffinity()
            })
            .setNegativeButton("TIDAK", DialogInterface.OnClickListener{dialog, which -> dialog.cancel()
            }  )
            .show()
    }
}