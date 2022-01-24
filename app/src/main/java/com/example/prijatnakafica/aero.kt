package com.example.prijatnakafica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class aero : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aero)

        val EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT";
        val steps : Array<String> = intent.getStringArrayExtra(EXTRA_TEXT) as Array<String>

        val actionBar = supportActionBar
        actionBar!!.title = "AeroPress"
        actionBar.setDisplayHomeAsUpEnabled(true)

        layoutManager = LinearLayoutManager(this)
        val myRecyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        myRecyclerView.layoutManager = layoutManager
        adapter = RecyclerAdapter(steps)
        myRecyclerView.adapter = adapter
    }
}