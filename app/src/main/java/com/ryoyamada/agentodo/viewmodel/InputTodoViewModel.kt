package com.ryoyamada.agentodo.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InputTodoViewModel: ViewModel() {
    var todoTitle = MutableLiveData<String>()
}
