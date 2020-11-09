package com.example.appchat.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appchat.R

class ListNotidicationAdapter(private val list : List<String>) : RecyclerView.Adapter<ListNotidicationAdapter.NotifiViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotifiViewHolder {
       val itemView = LayoutInflater.from(parent.context).inflate(R.layout.custom_notification, parent, false)
        return NotifiViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NotifiViewHolder, position: Int) {
        val current = list[position]
        holder.txt_notifi.text = current
    }

    override fun getItemCount(): Int {
        return list.size
    }
    inner class NotifiViewHolder(itemview : View) : RecyclerView.ViewHolder(itemview) {
        val txt_notifi = itemview.findViewById<TextView>(R.id.txt_notification)
    }
}