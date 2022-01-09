package com.ranzed.dagger2.lesson2

data class NewsItem(val id: Int, val title: String, val description: String)

data class NewsItemTrackingAction(val action: NewsItemTrackingActionType, val newsItemId: Int)

enum class NewsItemTrackingActionType(val v:Byte) {
    LOAD(0),
    OPEN(1),
    CLOSE(2)
}