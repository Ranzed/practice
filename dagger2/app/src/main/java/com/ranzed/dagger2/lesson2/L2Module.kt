package com.ranzed.dagger2.lesson2

import dagger.Binds
import dagger.Module

@Module
interface L2Module {

    @Binds
    fun bindAnalyticsImplToAnalytics(l2AnalyticsImpl: L2AnalyticsImpl): L2Analytics

    @Binds
    fun bindNewRepoImplToNewsRepo(l2NewsRepoImpl: L2NewsRepoImpl): L2NewsRepo

    @Binds
    fun bindL2NewsWebServiceImplToL2NewsWebService(l2NewsWebServiceImpl: L2NewsWebServiceImpl): L2NewsWebService
}