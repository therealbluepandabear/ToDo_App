package com.example.todo_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todo_app.databinding.ItemsBinding

class ItemsActivity : AppCompatActivity(), OnItemClickListener {
    private lateinit var binding: ItemsBinding

    lateinit var thisGroup: Group
    var itemsAdapter: ItemsAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setBindings()



        var selectedIndex = intent.getIntExtra("groupIndex", 0)
        thisGroup = AppData.groups[selectedIndex]
        binding.toolbarTitle.text = thisGroup.name

        binding.itemsRecyclerView.layoutManager = LinearLayoutManager(this)
        itemsAdapter = ItemsAdapter(thisGroup, this)
        binding.itemsRecyclerView.adapter = itemsAdapter

        setSupportActionBar(binding.toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowTitleEnabled(false)

        binding.newItemEditText.setOnKeyListener { view, keyCode, event ->
            false
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun setBindings() {
        binding = ItemsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun itemClicked(index: Int) {
        thisGroup.items[index].completed = !thisGroup.items[index].completed
        itemsAdapter!!.notifyItemChanged(index)
    }

    override fun itemLongClicked(index: Int) {
        TODO("Not yet implemented")
    }
}