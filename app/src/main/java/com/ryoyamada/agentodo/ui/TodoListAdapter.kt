package com.ryoyamada.agentodo.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ryoyamada.agentodo.R
import com.ryoyamada.agentodo.databinding.TodoRowBinding
import com.ryoyamada.agentodo.model.Todo

class TodoListAdapter : RecyclerView.Adapter<TodoRowViewHolder>() {
    var todos = listOf<Todo>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoRowViewHolder {
        val binding = DataBindingUtil.inflate<TodoRowBinding>(
            LayoutInflater.from(parent.context),
            R.layout.todo_row,
            parent,
            false
        )
        return TodoRowViewHolder(binding)
    }

    override fun getItemCount(): Int = todos.size

    override fun onBindViewHolder(holder: TodoRowViewHolder, position: Int) {
        holder.bind(todos[position])
    }

    fun update(list: List<Todo>) {
        todos = list
        notifyDataSetChanged()
    }
}

class TodoRowViewHolder(val binding: TodoRowBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(todo: Todo) {
        binding.todo = todo
    }
}
