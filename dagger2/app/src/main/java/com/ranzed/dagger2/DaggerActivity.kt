package com.ranzed.dagger2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.ranzed.dagger2.lesson1.Lesson1Main
import javax.inject.Inject

class DaggerActivity: AppCompatActivity() {

    @Inject
    lateinit var lesson1Main: Lesson1Main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        applicationContext.lesson1Component.inject(this)
        applicationContext.lesson1Component.inject(lesson1Main)
        Log.i("test1", lesson1Main.toString())
    }
}