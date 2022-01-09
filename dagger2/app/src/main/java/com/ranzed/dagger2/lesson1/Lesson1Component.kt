package com.ranzed.dagger2.lesson1

import com.ranzed.dagger2.DaggerActivity
import dagger.Component

@Component(modules = [Lesson1Module::class])
interface Lesson1Component { // why name "component"? graph?

    fun createComplexModel(): ComplexModel

    fun abcd(): Lesson1Main

    //fun inject(d: DaggerActivity)

    fun inject(l: Lesson1Main)
}

