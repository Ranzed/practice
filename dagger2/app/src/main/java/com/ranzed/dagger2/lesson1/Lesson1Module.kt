package com.ranzed.dagger2.lesson1

import dagger.Module
import dagger.Provides

@Module
class Lesson1Module { // must be class or object

    @Provides
    fun createComplexModel(p1: SimplePart1, p2: SimplePart2, p3: SimplePart3): ComplexModel {
        return ComplexModel(p1, p2, p3)
    }

    @Provides
    fun createSimplePart1(): SimplePart1 = SimplePart1()

    @Provides
    fun createSimplePart2(): SimplePart2 = SimplePart2()

    @Provides
    fun createSimplePart3(): SimplePart3 = SimplePart3()
}