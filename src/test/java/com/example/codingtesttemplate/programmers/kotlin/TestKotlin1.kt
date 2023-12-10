package com.example.codingtesttemplate.programmers.kotlin

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class TestKotlin1 : FunSpec({
    val solution = SolutionKotlin1()

    test("test1") {
        val s = "1234"
        val answer = 1234

        solution.solution(s) shouldBe answer
    }

    test("test2") {
        val s = "1234"
        val answer = 1234

        solution.solution(s) shouldBe answer
    }
})
