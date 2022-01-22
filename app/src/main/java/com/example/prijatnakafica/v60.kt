package com.example.prijatnakafica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class v60 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_v60)

        val actionBar = supportActionBar
        actionBar!!.title = "V60"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}