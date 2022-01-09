package com.ranzed.dagger2.lesson2

import javax.inject.Inject

interface L2NewsRepo {

    fun getLatestNews(): List<NewsItem>

    fun getNewsItem(id: Int) : NewsItem
}

class L2NewsRepoImpl @Inject constructor(private val webService: L2NewsWebService): L2NewsRepo {

    override fun getLatestNews() = webService.getLatestNews()

    override fun getNewsItem(id: Int) = webService.getNewsItem(id)

}