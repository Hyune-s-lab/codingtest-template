package com.example.codingtesttemplate.programmers.kotlin

/**
 * 프로그래머스 연습 문제: x만큼 간격이 있는 n개의 숫자
 *
 * https://school.programmers.co.kr/learn/courses/30/lessons/12954
 */
class SolutionKotlin2 {
    // 사용법 1. 프로그래머스 문제의 solution 메서드를 복사합니다.
    fun solution(x: Int, n: Int): LongArray {
        val answer = LongArray(n)

        for (i in 1 until n + 1) {
            answer[i - 1] = x.toLong() * i
        }

        return answer
    }
}
