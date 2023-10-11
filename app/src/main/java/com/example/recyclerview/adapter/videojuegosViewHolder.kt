package com.example.recyclerview.adapter

import android.graphics.ColorSpace.Model
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.recyclerview.R
import com.example.recyclerview.videojuegos

class videojuegosViewHolder(view:View):ViewHolder(view){

    val videojuegos = view.findViewById<TextView>(R.id.tvvideojuegosName)
    val publisher = view.findViewById<TextView>(R.id.tvPublisher)
    val photo = view.findViewById<ImageView>(R.id.ivvideojuegos)


    fun render(videojuegosModel: videojuegos){
        videojuegos.text = videojuegosModel.personaje
        publisher.text = videojuegosModel.publisher
        Glide.with(photo.context).load(videojuegosModel.photo).into(photo)


    }
}