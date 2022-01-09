package com.ranzed.dagger2.lesson2

import javax.inject.Inject

interface L2NewsWebService {

    fun getLatestNews(): List<NewsItem>

    fun getNewsItem(id: Int) : NewsItem
}

class L2NewsWebServiceImpl @Inject constructor(): L2NewsWebService {

    override fun getLatestNews(): List<NewsItem> =
        listOf(NewsItem(1, "Title1", "Description1"), NewsItem(2, "Title2", "Description2"))

    override fun getNewsItem(id: Int) = NewsItem(id, "Title$id", "Description$id")

}