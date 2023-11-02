package com.example.codingtesttemplate.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestJava1 {
    private final SolutionJava1 solution = new SolutionJava1();

    @Test
    void test1() {
        final String s = "1234";
        final int answer = 1234;

        assertThat(solution.solution(s)).isEqualTo(answer);
    }

    @Test
    void test2() {
        final String s = "1234";
        final int answer = 1234;

        assertThat(solution.solution(s)).isEqualTo(answer);
    }
}
