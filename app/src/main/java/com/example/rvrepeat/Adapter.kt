package com.example.rvrepeat

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(val items: List<Model>): RecyclerView.Adapter<Adapter.ViewHolder>() {
    inner class ViewHolder (view: View) : RecyclerView.ViewHolder(view){
        val textV = view.findViewById<TextView>(R.id.TV2)
        val iv = view.findViewById<ImageView>(R.id.smile)

        fun bind(item: Model){
            textV.text =item.tv
            iv.setImageResource(item.smile)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(LayoutInflater.from(parent.context).
        inflate(R.layout.card, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size
}