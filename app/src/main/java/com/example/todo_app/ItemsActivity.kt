package com.example.todo_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.todo_app.databinding.ItemsBinding

class ItemsActivity : AppCompatActivity() {
    private lateinit var binding: ItemsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setBindings()

        var selectedIndex = intent.getIntExtra("groupIndex", 0)
        var thisGroup = AppData.groups[selectedIndex]

        binding.toolbarTitle.text = thisGroup.name

        setSupportActionBar(binding.toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowTitleEnabled(false)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun setBindings() {
        binding = ItemsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}