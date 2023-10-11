package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.videojuegos

class videojuegosAdapter(private val videojuegosList:List<videojuegos>) : RecyclerView.Adapter<videojuegosViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): videojuegosViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return videojuegosViewHolder(layoutInflater.inflate(R.layout.item_videojuegos, parent, false))
    }

    override fun getItemCount(): Int = videojuegosList.size


    override fun onBindViewHolder(holder: videojuegosViewHolder, position: Int) {
        val item = videojuegosList[position]
        holder.render(item)

    }
}