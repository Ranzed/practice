package com.ranzed.dagger2.lesson2

import javax.inject.Inject

interface L2Analytics {

    fun trackAction(action: NewsItemTrackingAction)
}

class L2AnalyticsImpl @Inject constructor(): L2Analytics {

    override fun trackAction(action: NewsItemTrackingAction) {
        // analyticsService.request(action)
    }

}