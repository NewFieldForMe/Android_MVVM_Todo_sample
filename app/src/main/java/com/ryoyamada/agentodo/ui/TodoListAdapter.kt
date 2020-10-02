package com.ryoyamada.agentodo.ui

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ryoyamada.agentodo.databinding.TodoRowBinding
import com.ryoyamada.agentodo.model.Todo

class TodoListAdapter : RecyclerView.Adapter<TodoRowViewHolder>() {
    var todos = listOf<Todo>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoRowViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: TodoRowViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}

class TodoRowViewHolder(val binding: TodoRowBinding) : RecyclerView.ViewHolder(binding.root) {

}
