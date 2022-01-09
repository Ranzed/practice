package com.ranzed.dagger2

import android.app.Application
import android.content.Context
import com.ranzed.dagger2.lesson1.DaggerLesson1Component
import com.ranzed.dagger2.lesson1.Lesson1Component

class DaggerApp: Application() {

    lateinit var lesson1Component: Lesson1Component

    override fun onCreate() {
        super.onCreate()
        lesson1Component = DaggerLesson1Component.create()
    }
}

val Context.lesson1Component: Lesson1Component
    get() = when (this) {
        is DaggerApp -> this.lesson1Component
        else -> this.applicationContext.lesson1Component
    }