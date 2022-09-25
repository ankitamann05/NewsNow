package com.example.newsnow

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){
    val titleView : TextView = itemView.findViewById(R.id.title)
    val image : ImageView = itemView.findViewById(R.id.image)
    val author : TextView = itemView.findViewById(R.id.author)
}