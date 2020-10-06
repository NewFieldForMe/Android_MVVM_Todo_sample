package com.ryoyamada.agentodo.model

import java.util.*

data class Todo (
    val id: UUID,
    val title: String
) {
    companion object {
        fun makeTestData() = listOf(
            Todo(UUID.randomUUID(), "test1"),
            Todo(UUID.randomUUID(), "test2"),
            Todo(UUID.randomUUID(), "test3")
        )
    }
}
