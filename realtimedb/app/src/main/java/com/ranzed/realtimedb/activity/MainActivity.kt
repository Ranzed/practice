package com.ranzed.realtimedb.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.ranzed.realtimedb.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }

    override fun onResume() {
        super.onResume()
        initFragments()
        loadDb()
    }

    private fun initFragments() {

    }

    private fun loadDb() {
        val realtimeDb = Firebase.database("https://practice-adc43-default-rtdb.europe-west1.firebasedatabase.app/")
        val ref = realtimeDb.reference
    }
}