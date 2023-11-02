package com.example.codingtesttemplate.programmers;

/**
 * 프로그래머스 연습 문제: x만큼 간격이 있는 n개의 숫자
 * <p>
 * https://school.programmers.co.kr/learn/courses/30/lessons/12954
 */
public class SolutionJava2 {
    // 사용법 1. 프로그래머스 문제의 solution 메서드를 복사합니다.
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int i = 1; i < n + 1; i++) {
            answer[i - 1] = (long) x * i;
        }

        return answer;
    }
}
