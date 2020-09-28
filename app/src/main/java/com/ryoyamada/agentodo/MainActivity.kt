package com.ryoyamada.agentodo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ryoyamada.agentodo.ui.TodoListFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, TodoListFragment())
            fragmentTransaction.commit()
        }
    }
}
