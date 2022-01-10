package com.ranzed.dagger2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.ranzed.dagger2.lesson1.Lesson1Main
import com.ranzed.dagger2.lesson2.L2Analytics
import com.ranzed.dagger2.lesson2.L2NewsRepo
import com.ranzed.dagger2.lesson2.NewsItemTrackingAction
import com.ranzed.dagger2.lesson2.NewsItemTrackingActionType
import javax.inject.Inject

class DaggerActivity: AppCompatActivity() {

//    @Inject
//    lateinit var lesson1Main: Lesson1Main

    @Inject
    lateinit var l2NewsRepo: L2NewsRepo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        applicationContext.lesson1Component.inject(this)
//        applicationContext.lesson1Component.inject(lesson1Main)
//        Log.i("test", lesson1Main.toString())

        applicationContext.lesson2Component.inject(this)
        Log.i("test", l2NewsRepo.getNewsItem(1).toString())
    }

    @Inject
    fun trackStart(analytics: L2Analytics) {
        analytics.trackAction(NewsItemTrackingAction(NewsItemTrackingActionType.OPEN, 0))
        Log.i("test", "track open action by $analytics")
    }
}