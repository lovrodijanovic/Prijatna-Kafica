package com.example.prijatnakafica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class french : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_french)

        val actionBar = supportActionBar
        actionBar!!.title = "French Press"
        actionBar.setDisplayHomeAsUpEnabled(true)

        layoutManager = LinearLayoutManager(this)
        val myRecyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        myRecyclerView.layoutManager = layoutManager
        adapter = RecyclerAdapter()
        myRecyclerView.adapter = adapter
    }
}