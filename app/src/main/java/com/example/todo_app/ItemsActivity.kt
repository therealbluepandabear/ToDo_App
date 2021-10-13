package com.example.todo_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.todo_app.databinding.ItemsBinding

class ItemsActivity : AppCompatActivity() {
    private lateinit var binding: ItemsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.items)
    }
    private fun setBindings() {
        binding = ItemsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}