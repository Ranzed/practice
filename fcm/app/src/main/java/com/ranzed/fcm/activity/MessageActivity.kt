package com.ranzed.fcm.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import com.ranzed.fcm.R
import com.ranzed.fcm.notification.NotificationService

class MessageActivity : AppCompatActivity() {

    private var createNotification : AppCompatButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)
        createNotification = findViewById(R.id.btn_create_notification)
        createNotification?.setOnClickListener { view : View ->
            NotificationService.createNotification("123", "456", this)}
    }
}