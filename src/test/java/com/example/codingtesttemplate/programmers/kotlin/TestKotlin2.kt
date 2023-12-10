package com.example.codingtesttemplate.programmers.kotlin

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class TestKotlin2 : FunSpec({
    val solution = SolutionKotlin2()

    test("test1") {
        val x = 2
        val n = 5
        val answer = longArrayOf(2, 4, 6, 8, 10)

        solution.solution(x, n) shouldBe answer
    }

    test("test2") {
        val x = 4
        val n = 3
        val answer = longArrayOf(4, 8, 12)

        solution.solution(x, n) shouldBe answer
    }

    test("test3") {
        val x = -4
        val n = 2
        val answer = longArrayOf(-4, -8)

        solution.solution(x, n) shouldBe answer
    }
})
