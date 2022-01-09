package com.ranzed.dagger2.lesson2

import com.ranzed.dagger2.DaggerActivity
import dagger.Component

@Component(modules = [L2Module::class])
interface L2Component {

    fun inject(d: DaggerActivity)
}