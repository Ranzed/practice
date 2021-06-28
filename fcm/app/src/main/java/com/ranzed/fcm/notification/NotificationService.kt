package com.ranzed.fcm.notification

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.core.app.NotificationCompat
import com.ranzed.fcm.R

object NotificationService {

    private val CHANNEL_ID = "fcm_channel_id"
    private var initialized = false

    fun createNotification(title: String?, message : String?, ctx : Context) {
        if (!initialized)
            return

        val builder = NotificationCompat.Builder(ctx, CHANNEL_ID)
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentTitle(title)
            .setContentText(message)

        val notificationManager = ctx.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.notify(0, builder.build())

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

        val c = notificationManager.getNotificationChannel(CHANNEL_ID)
        if (c != null)
            return

        val channel = NotificationChannel(CHANNEL_ID,
            ctx.getString(R.string.notification_channel_name),
            NotificationManager.IMPORTANCE_DEFAULT)
        channel.description = ctx.getString(R.string.notification_channel_description)

        notificationManager.createNotificationChannel(channel)
    }

}