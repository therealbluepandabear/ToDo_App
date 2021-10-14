package com.example.todo_app

import android.graphics.Color
import android.graphics.Paint
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

        if (item.completed) {
            itemNameTextView.paintFlags = itemNameTextView.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
            itemView.setBackgroundColor(Color.LTGRAY)
        } else {
            itemNameTextView.paintFlags = itemNameTextView.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG.inv()
            itemView.setBackgroundColor(Color.LTGRAY)
            itemView.setBackgroundColor(Color.TRANSPARENT)
        }
    }
}