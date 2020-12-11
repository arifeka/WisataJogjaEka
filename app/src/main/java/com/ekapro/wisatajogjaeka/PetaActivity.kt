package com.ekapro.wisatajogjaeka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class PetaActivity : AppCompatActivity(), OnMapReadyCallback {

    lateinit var peta : SupportMapFragment
    lateinit var gmap : GoogleMap


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_peta)

        peta = this.supportFragmentManager.findFragmentById(R.id.mapfragment) as SupportMapFragment
        peta.getMapAsync(this)
    }

    override fun onMapReady(p0: GoogleMap?) {
        gmap = p0!!
       //posisi pertama
        val smk : LatLng
        smk = LatLng(-7.777099105147527,110.36758479486825)

        gmap.addMarker(MarkerOptions().position(smk).title("SMKN 2 Yogyakarta"))
        gmap.moveCamera(CameraUpdateFactory.newLatLngZoom(smk, 15F))
        //akhir posisi pertama

        val prambanan : LatLng
        prambanan = LatLng(-7.754000428695888, 110.4942909348078)

        gmap.addMarker(MarkerOptions().position(prambanan).title("Candi Prambanan"))
        gmap.moveCamera(CameraUpdateFactory.newLatLngZoom(prambanan, 15F))

        val malioboro : LatLng
        malioboro = LatLng(-7.790131942984804, 110.3661578383102)

        gmap.addMarker(MarkerOptions().position(malioboro).title("Malioboro"))
        gmap.moveCamera(CameraUpdateFactory.newLatLngZoom(malioboro, 15F))

        val tugu : LatLng
        tugu = LatLng(-7.782787422947276, 110.36707647247812)

        gmap.addMarker(MarkerOptions().position(tugu).title("Tugu Jogja"))
        gmap.moveCamera(CameraUpdateFactory.newLatLngZoom(tugu, 15F))

    }
}