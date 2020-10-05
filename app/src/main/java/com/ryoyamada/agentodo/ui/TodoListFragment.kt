package com.ryoyamada.agentodo.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ryoyamada.agentodo.R
import com.ryoyamada.agentodo.model.Todo
import kotlinx.android.synthetic.main.fragment_todo_list.*
import java.util.*

class TodoListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_todo_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = TodoListAdapter()
        val todo1 = Todo(UUID.randomUUID(), "test1")
        val todo2 = Todo(UUID.randomUUID(), "test2")
        val todo3 = Todo(UUID.randomUUID(), "test3")
        adapter.todos = listOf(todo1, todo2, todo3)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
    }
}
