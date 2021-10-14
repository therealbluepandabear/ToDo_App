package com.example.todo_app

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemsViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_row, parent, false)) {
    private var itemNameTextView: TextView = itemView.findViewById(R.id.itemNameTextView)
    private var itemCheckBox: CheckBox = itemView.findViewById(R.id.itemCheckBox)

    fun bind(item: Item) {
        itemNameTextView.text = item.name
        itemCheckBox.isChecked = item.completed
    }
}