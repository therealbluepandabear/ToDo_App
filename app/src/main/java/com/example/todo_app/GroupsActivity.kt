package com.example.todo_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.todo_app.databinding.GroupsBinding

class GroupsActivity : AppCompatActivity() {
    private lateinit var binding: GroupsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setBindings()

        binding.groupsRecyclerView.layoutManager = LinearLayoutManager(this)

        AppData.initialize()
        val groupsAdapter = GroupsAdapter(AppData.groups)
        binding.groupsRecyclerView.adapter = groupsAdapter
    }
    private fun setBindings() {
        binding = GroupsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}