package com.example.appchat.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appchat.R
import com.example.appchat.adapter.ListNotidicationAdapter

class FragmentNotifications : Fragment() {
    private var listFr : List<String>  = listOf("java", "kotlin", "javascript", "golang")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_notifications, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view_notifi)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = ListNotidicationAdapter(listFr)
        return view
    }

}