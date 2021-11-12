package com.example.todo_app

internal fun findCompletion(group: Group): CompletionRate {
    val totalItems = group.items.size
    val activeItems = group.items.count { !it.completed }
    val completedItems = group.items.count { it.completed }

    val activeRate = (100 * activeItems / totalItems).toFloat()
    val completedRate = (100 * completedItems / totalItems).toFloat()

    return CompletionRate(activeRate, completedRate)
}

data class CompletionRate(val activeRate: Float, val completedRate: Float)