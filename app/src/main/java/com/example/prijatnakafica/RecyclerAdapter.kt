package com.example.prijatnakafica

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var steps = arrayOf("Pour 60g of water and evenly saturate the coffee", "Gently stir the grounds to ensure all coffee is immersed","Wait for the coffee to bloom","Pour the remaining 290.00g of water in a spiral motion","Allow the coffee to steep for 3 minutes","Gently press the filter down and serve in a warm cup")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemStep.text = steps[position]
    }

    override fun getItemCount(): Int {
        return steps.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemStep: TextView

        init{
            itemStep = itemView.findViewById(R.id.item_step)
        }
    }
}