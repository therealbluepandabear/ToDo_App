package com.example.todo_app

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.todo_app.databinding.GroupsBinding

class GroupsActivity : AppCompatActivity(), OnGroupClickListener {
    private lateinit var binding: GroupsBinding

    var groupsAdapter: GroupsAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setBindings()

        binding.groupsRecyclerView.layoutManager = LinearLayoutManager(this)

        AppData.initialize()
        groupsAdapter = GroupsAdapter(AppData.groups, this)
        binding.groupsRecyclerView.adapter = groupsAdapter
    }

    @SuppressLint("NotifyDataSetChanged") // SUPPRESSED FOR NOW UNTIL BETTER SOLUTION FOUND.
    override fun onResume() {
        super.onResume()
        groupsAdapter!!.notifyDataSetChanged()
    }

    private fun setBindings() {
        binding = GroupsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun createNewGroup(v: View) {
        val builder = AlertDialog.Builder(this)

        builder.setTitle("New Group")
        builder.setMessage("Please enter a name for your new group")

        val myInput = EditText(this)
        myInput.inputType = InputType.TYPE_CLASS_TEXT
        builder.setView(myInput)

        builder.setPositiveButton("Save") { dialog, which ->
            val groupName: String = myInput.text.toString()
            val newGroup = Group(groupName, mutableListOf())

            AppData.groups.add(newGroup)
            groupsAdapter!!.notifyItemInserted(AppData.groups.count())
        }

        builder.setNegativeButton("Cancel") { _, _ ->

        }

        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    override fun groupClicked(index: Int) {
        val intent = Intent(this, ItemsActivity::class.java)

        intent.putExtra("groupIndex", index)

        startActivity(intent)

        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
    }

    override fun groupLongClicked(index: Int) {
        AppData.groups.removeAt(index)
        groupsAdapter!!.notifyItemRemoved(index)
    }
}