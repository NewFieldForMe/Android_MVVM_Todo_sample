package com.ryoyamada.agentodo.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

open class Todo (
    @PrimaryKey var id: String = "",
    var title: String = ""
) : RealmObject() {
    companion object {
        fun makeTestData() = listOf(
            Todo(UUID.randomUUID().toString(), "test1"),
            Todo(UUID.randomUUID().toString(), "test2"),
            Todo(UUID.randomUUID().toString(), "test3")
        )
    }
}
