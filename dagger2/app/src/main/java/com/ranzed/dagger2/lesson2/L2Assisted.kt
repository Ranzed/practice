package com.ranzed.dagger2.lesson2

import android.util.Log
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject

class L2AssistedClass @AssistedInject constructor(
    @Assisted
    private val detailValue: String,
    private val analytics: L2Analytics) {

    fun doWork() {
        analytics.trackAction(NewsItemTrackingAction(NewsItemTrackingActionType.LOAD, 1))
        Log.i("test", "L2AssistedClass $detailValue")
    }

    @AssistedFactory
    interface Factory {
        fun create(detailValue: String): L2AssistedClass
    }
}
