package com.ryoyamada.agentodo.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ryoyamada.agentodo.model.Todo

class TodoListViewModel: ViewModel() {
    var todos = MutableLiveData<MutableList<Todo>>(mutableListOf())
}
