package com.example.appchat.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appchat.R
import com.example.appchat.adapter.ListFriendAdapter

class FragmentUser : Fragment() {
    private var listFr : List<String>  = listOf("java", "kotlin", "javascript", "golang")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        var recycler_view : RecyclerView = view!!.findViewById(R.id.recycler_view)
        val view = inflater.inflate(R.layout.fragment_user, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = ListFriendAdapter(listFr)
        recyclerView.setHasFixedSize(true)
        return view
    }

}