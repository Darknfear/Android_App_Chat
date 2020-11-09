package com.example.appchat.fragment

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appchat.R
import com.example.appchat.adapter.ListFriendAdapter
import com.example.appchat.view.HomeActivity
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_friend.*

class FragmentFriend : Fragment() {
    private var listFr : List<String>  = listOf("java", "kotlin", "javascript", "golang")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_friend, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view_friend)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = ListFriendAdapter(listFr)

        return view
    }

}