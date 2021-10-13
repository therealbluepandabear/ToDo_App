package com.example.todo_app

class AppData {
    companion object DataHolder {
        var groups: MutableList<Group> = mutableListOf()

        fun initialize() {
            val item1 = Item("Bread", false)
            val item2 = Item("Milk", false)

            val item3 = Item("Tap to cross", false)
            val item4 = Item("Long press to delete", false)

            val group1 = Group("Home", mutableListOf(item1, item2))
            val group2 = Group("Training", mutableListOf(item3, item4))

            groups = mutableListOf(group1, group2)
        }
    }
}