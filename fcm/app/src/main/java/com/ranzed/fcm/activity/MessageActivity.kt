package com.ranzed.fcm.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.ranzed.fcm.R

class MessageActivity : AppCompatActivity() {

    private var helloText : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)
        helloText = findViewById(R.id.hello)
    }
}