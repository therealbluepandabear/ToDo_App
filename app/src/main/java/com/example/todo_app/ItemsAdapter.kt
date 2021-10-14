package com.example.todo_app

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ItemsAdapter(private val group: Group) : RecyclerView.Adapter<ItemsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ItemsViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: ItemsViewHolder, position: Int) {
        val item: Item = group.items[position]
        holder.bind(item)
    }

    override fun getItemCount() = group.items.size

}