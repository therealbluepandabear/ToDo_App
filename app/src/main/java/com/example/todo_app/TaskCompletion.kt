package com.example.todo_app

internal fun findCompletion(group: Group) {
    val totalItems = group.items.size
    val activeItems = group.items.count { !it.completed }
}

data class CompletionRate(val activeRate: Float, val completedRate: Float)