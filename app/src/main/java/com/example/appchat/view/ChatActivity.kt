package com.example.appchat.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appchat.R
import com.example.appchat.adapter.MessageAdapter

class ChatActivity : AppCompatActivity() {
    private var listFr : List<String>  = listOf("java", "kotlin", "javascript", "golang")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)
        onCreatedView()
    }

    fun onCreatedView(){
        val recyclerView = findViewById<RecyclerView>(R.id.reyclerview_message_list)
        recyclerView.adapter = MessageAdapter(listFr)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}