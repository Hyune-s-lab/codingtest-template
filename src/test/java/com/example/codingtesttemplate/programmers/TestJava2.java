package com.example.codingtesttemplate.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestJava2 {
    // 사용법 2. 대상 solution 클래스를 선언 합니다.
    private final SolutionJava2 solution = new SolutionJava2();

    // 사용법 3. `실행 결과` 탭에 있는 입력값, 기댓값, 실행 결과를 작성합니다.
    @Test
    void test1() {
        final int x = 2;
        final int n = 5;
        final long[] answer = {2, 4, 6, 8, 10};

        assertThat(solution.solution(x, n)).isEqualTo(answer);
    }

    @Test
    void test2() {
        final int x = 4;
        final int n = 3;
        final long[] answer = {4, 8, 12};

        assertThat(solution.solution(x, n)).isEqualTo(answer);
    }

    @Test
    void test3() {
        final int x = -4;
        final int n = 2;
        final long[] answer = {-4, -8};

        assertThat(solution.solution(x, n)).isEqualTo(answer);
    }
}
