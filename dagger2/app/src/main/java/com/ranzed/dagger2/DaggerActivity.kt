package com.ranzed.dagger2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.ranzed.dagger2.lesson1.Lesson1Main
import com.ranzed.dagger2.lesson2.*
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

    @Inject
    fun assistedInject(f: L2AssistedClass.Factory) {
        val l2A = f.create("assistedInjectTesting")
        l2A.doWork()
        Log.i("test", "assistedInject $l2A")
    }
}