package com.example.prijatnakafica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class chemex : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chemex)

        val actionBar = supportActionBar
        actionBar!!.title = "Chemex"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}