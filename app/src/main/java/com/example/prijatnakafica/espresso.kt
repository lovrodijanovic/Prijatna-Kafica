package com.example.prijatnakafica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class espresso : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_espresso)

        val actionBar = supportActionBar
        actionBar!!.title = "Espresso"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}