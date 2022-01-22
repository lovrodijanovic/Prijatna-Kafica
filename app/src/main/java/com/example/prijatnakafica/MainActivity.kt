package com.example.prijatnakafica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ImageButton>(R.id.chemex).setOnClickListener {
            val intent = Intent(this, chemex::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.v60).setOnClickListener {
            val intent = Intent(this, v60::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.aero).setOnClickListener {
            val intent = Intent(this, aero::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.espresso).setOnClickListener {
            val intent = Intent(this, espresso::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.french).setOnClickListener {
            val intent = Intent(this, french::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.mocca).setOnClickListener {
            val intent = Intent(this, mocca::class.java)
            startActivity(intent)
        }
    }
}