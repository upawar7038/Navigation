package com.example.festunavigator.data

import android.app.Application
import androidx.viewbinding.BuildConfig
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {

    companion object {
        const val ADMIN_MODE = "admin"
        const val USER_MODE = "user"
         var mode = BuildConfig.DEBUG
         var isAdmin:Boolean=true
        // var isUser = mode == USER_MODE
    }
}