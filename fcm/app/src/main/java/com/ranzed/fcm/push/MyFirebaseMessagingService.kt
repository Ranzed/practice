package com.ranzed.fcm.push

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.ranzed.fcm.notification.NotificationService

class MyFirebaseMessagingService : FirebaseMessagingService() {

    override fun onNewToken(p0: String) {
        super.onNewToken(p0)
    }

    override fun onMessageReceived(rm: RemoteMessage) {
        super.onMessageReceived(rm)
        Log.d("FCM", "onMessageReceived {%s}".format(rm.toString()))
        NotificationService.createNotification(rm.notification?.title , rm.notification?.body, this)
    }
}