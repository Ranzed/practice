package com.ranzed.fcm.notification

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.core.app.NotificationCompat
import com.ranzed.fcm.R

object NotificationService {

    private const val CHANNEL_ID = "fcm_channel_id"
    private var initialized = false

    fun createNotification(title: String?, message : String?, ctx : Context) {
        if (!initialized)
            return

        with(ctx.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager) {
            notify(0,
                NotificationCompat.Builder(ctx, CHANNEL_ID).apply {
                    setSmallIcon(R.mipmap.ic_launcher)
                    setContentTitle(title)
                    setContentText(message) }
                    .build())
        }

    }

    fun initialize(ctx : Context) {
        if (initialized)
            return

        createNotificationChannel(ctx)
        initialized = true
    }

    private fun createNotificationChannel(ctx : Context) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O)
            return

        val notificationManager = ctx.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        if (notificationManager.getNotificationChannel(CHANNEL_ID) != null)
            return

        val channel = NotificationChannel(CHANNEL_ID,
            ctx.getString(R.string.notification_channel_name),
            NotificationManager.IMPORTANCE_DEFAULT)
        channel.description = ctx.getString(R.string.notification_channel_description)

        notificationManager.createNotificationChannel(channel)
    }

}