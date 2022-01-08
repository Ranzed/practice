package com.ranzed.dagger2.lesson1

import dagger.Component

@Component(modules = [Lesson1Module::class])
interface Lesson1Component { // why name "component"? graph?

    fun createComplexModel(): ComplexModel
}

