package com.example.todo_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.todo_app.databinding.GroupsBinding

class GroupsActivity : AppCompatActivity() {
    private lateinit var binding: GroupsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setBindings()

        binding.groupsRecyclerView.layoutManager = LinearLayoutManager(this)

        val groupsAdapter = GroupsAdapter(AppData.groups)
        binding.groupsRecyclerView.adapter = groupsAdapter
    }
    private fun setBindings() {
        binding = GroupsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}

class GroupsViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(
        R.layout.group_row,
        parent,
        false)) {

}

class GroupsAdapter(private val list: List<Group>) : RecyclerView.Adapter<GroupsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupsViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: GroupsViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}