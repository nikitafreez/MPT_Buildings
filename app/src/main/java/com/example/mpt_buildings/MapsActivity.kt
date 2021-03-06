package com.example.mpt_buildings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        val nezhinskaya = LatLng(55.7125115, 37.4767173)
        val nahimovskiy = LatLng(55.665013, 37.5978966)
        mMap.addMarker(MarkerOptions().position(nezhinskaya).title("ул.Нежинская, д.7"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(nezhinskaya))

        mMap.addMarker(MarkerOptions().position(nahimovskiy).title("ул.Нахимовский проспект, д.21"))
    }
}