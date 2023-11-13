package com.plutoapps.wonderlist.data.models

data class Todo(
    val id : String,
    val title : String,
    val subtitle : String? = null,
    val isCompleted : Boolean = false)

val sampleTodo = Todo(
    id = "01234567",
    title = "Walk the dogs",
    subtitle = "Do not forget to bring along a plastic bag for turds",
    isCompleted = false
)

val sampleTodo2 = Todo(
    id = "01234568",
    title = "Worship the cats",
    subtitle = "Bring a dog for sacrifice",
    isCompleted = true
)

val samples = listOf(
    sampleTodo, sampleTodo2
)