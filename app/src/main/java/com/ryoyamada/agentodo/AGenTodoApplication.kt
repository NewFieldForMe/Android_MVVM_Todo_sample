package com.ryoyamada.agentodo

import android.app.Application
import io.realm.Realm

class AGenTodoApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
}
