package com.ryoyamada.agentodo.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ryoyamada.agentodo.BuildConfig
import com.ryoyamada.agentodo.R
import com.ryoyamada.agentodo.viewmodel.TodoListViewModel
import com.ryoyamada.agentodo.model.Todo
import kotlinx.android.synthetic.main.fragment_todo_list.*
import androidx.lifecycle.Observer

class TodoListFragment : Fragment() {
    private val todoListViewModel =
        TodoListViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_todo_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fab.setOnClickListener {
            val fragmentManager = fragmentManager
            if (fragmentManager != null) {
                val fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.container, InputTodoFragment())
                fragmentTransaction.addToBackStack("TODO_LIST")
                fragmentTransaction.commit()
            }
        }
        val adapter = TodoListAdapter()

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
        todoListViewModel.todos.observe(viewLifecycleOwner, Observer { adapter.update(it ?: listOf()) })

        if (BuildConfig.DEBUG) todoListViewModel.todos.value = Todo.makeTestData().toMutableList()
    }
}
