package com.ranzed.fcm

import android.app.Application
import com.ranzed.fcm.notification.NotificationService

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        NotificationService.initialize(this)
    }

}