package com.ryoyamada.agentodo.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.ryoyamada.agentodo.MainActivity
import com.ryoyamada.agentodo.R
import com.ryoyamada.agentodo.databinding.FragmentInputTodoBinding
import com.ryoyamada.agentodo.viewmodel.InputTodoViewModel
import kotlinx.android.synthetic.main.fragment_input_todo.*

class InputTodoFragment : Fragment() {
    private val inputTodoViewModel = InputTodoViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_input_todo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding: FragmentInputTodoBinding = DataBindingUtil.bind(view) ?: throw RuntimeException("Can not bind.")
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = inputTodoViewModel

        val activity: MainActivity? = activity as? MainActivity
        activity?.setActionBarTitle("Input Todo")

        fab.setOnClickListener {
            this.fragmentManager?.popBackStack()
        }
    }
}
