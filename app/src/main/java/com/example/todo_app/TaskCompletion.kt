package com.example.todo_app

internal fun findCompletion(group: Group) {
    val totalItems = group.items.size
}

data class CompletionRate(val activeRate: Float, val completedRate: Float)