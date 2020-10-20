package com.ryoyamada.agentodo.repository

import com.ryoyamada.agentodo.model.Todo
import io.realm.Realm
import io.realm.kotlin.where

class TodoRepository {
    fun loadData(): MutableList<Todo> {
        val realm = Realm.getDefaultInstance()
        val allTodo = realm.where<Todo>().findAll().toMutableList()
        realm.close()
        return allTodo
    }
}
