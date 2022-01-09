package com.ranzed.dagger2.lesson1

import javax.inject.Inject

fun main() {
    val component = DaggerLesson1Component.create();
    val complexModel = component.createComplexModel()
    println("created model: $complexModel")
}


class Lesson1Main {

    @Inject
    lateinit var complexModel: ComplexModel

    @Inject
    lateinit var part2: SimplePart2

    override fun toString(): String {
        return "Lesson1Main(complexModel=$complexModel, part2=$part2)"
    }


}