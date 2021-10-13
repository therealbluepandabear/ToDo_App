package com.example.todo_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.todo_app.databinding.GroupsBinding

class GroupsActivity : AppCompatActivity() {
    private lateinit var binding: GroupsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setBindings()
    }
    private fun setBindings() {
        binding = GroupsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}