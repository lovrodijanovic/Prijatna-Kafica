package com.example.prijatnakafica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class mocca : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mocca)

        val actionBar = supportActionBar
        actionBar!!.title = "Mocca"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}