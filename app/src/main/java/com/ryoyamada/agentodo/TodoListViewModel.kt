package com.ryoyamada.agentodo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ryoyamada.agentodo.model.Todo

class TodoListViewModel: ViewModel() {
    var todos = MutableLiveData<MutableList<Todo>>(mutableListOf())
}
