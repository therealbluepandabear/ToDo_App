package com.example.todo_app

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GroupsViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(
        R.layout.group_row,
        parent,
        false)) {
    private var groupNameTextView: TextView = itemView.findViewById(R.id.groupNameTextView)
    private var groupCountTextView: TextView = itemView.findViewById(R.id.groupCountTextView)

    fun bind(group: Group) {
        groupNameTextView.text = group.name
        groupCountTextView.text = "${group.items.count()} items"
    }
}