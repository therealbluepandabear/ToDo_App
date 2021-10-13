package com.example.todo_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todo_app.databinding.GroupsBinding

class GroupsActivity : AppCompatActivity() {
    private lateinit var binding: GroupsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setBindings()

        binding.groupsRecyclerView.layoutManager = LinearLayoutManager(this)
    }
    private fun setBindings() {
        binding = GroupsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}