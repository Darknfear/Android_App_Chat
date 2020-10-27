package com.example.appchat.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.appchat.R

class ListFriendAdapter(private val lsFriends : List<String>) : RecyclerView.Adapter<ListFriendAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.custom_list_friend, parent, false)
        return ListViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val currentItem = lsFriends[position]
        Log.e("debug", lsFriends[position])
        holder.txt_Name.text = currentItem
    }

    override fun getItemCount(): Int {
        return lsFriends.size
    }

    inner class ListViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        //val profile_image : ImageView =  itemView.findViewById(R.id.profile_image)
        val txt_Name : TextView = itemView.findViewById(R.id.txt_name)
    }
}