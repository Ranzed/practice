package com.ranzed.fcm.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.ranzed.fcm.R
import com.ranzed.fcm.notification.NotificationService

class MessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)
        findViewById<AppCompatButton>(R.id.btn_create_notification)?.let {
            it.setOnClickListener { NotificationService.createNotification("123", "456", this) }
        }
    }
}