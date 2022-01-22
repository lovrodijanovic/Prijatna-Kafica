package com.example.prijatnakafica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class aero : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aero)

        val actionBar = supportActionBar
        actionBar!!.title = "AeroPress"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}