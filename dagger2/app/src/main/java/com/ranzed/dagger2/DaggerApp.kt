package com.ranzed.dagger2

import android.app.Application
import android.content.Context
import com.ranzed.dagger2.lesson1.DaggerLesson1Component
import com.ranzed.dagger2.lesson1.Lesson1Component
import com.ranzed.dagger2.lesson2.DaggerL2Component
import com.ranzed.dagger2.lesson2.L2Component

class DaggerApp: Application() {

    lateinit var lesson1Component: Lesson1Component

    lateinit var lesson2Component: L2Component


    override fun onCreate() {
        super.onCreate()
        lesson1Component = DaggerLesson1Component.create()
        lesson2Component = DaggerL2Component.create()
    }
}

val Context.lesson1Component: Lesson1Component
    get() = when (this) {
        is DaggerApp -> this.lesson1Component
        else -> this.applicationContext.lesson1Component
    }

val Context.lesson2Component: L2Component
    get() = when (this) {
        is DaggerApp -> this.lesson2Component
        else -> this.applicationContext.lesson2Component
    }