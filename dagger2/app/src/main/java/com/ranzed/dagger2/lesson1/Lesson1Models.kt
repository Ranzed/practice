package com.ranzed.dagger2.lesson1

class SimplePart1 {
    override fun toString() = "part 1"
}

class SimplePart2 {
    override fun toString() = "part 2"
}

class SimplePart3 {
    override fun toString() = "part 3"
}

data class ComplexModel(val p1: SimplePart1, val p2: SimplePart2, val p3: SimplePart3)