package com.programmers;

import java.util.Arrays;

public class Lv0_원소들의곱과합 {
    // 1. for문 사용
    public int solution(int[] num_list) {
        int result1 = 1;
        int result2 = 0;
        for (int i : num_list) {
            result1 *= i;
            result2 += i;
        }
        return result1 > Math.pow(result2, 2) ? 0 : 1;
    }

    // 2. stream, reduce 사용
    public int solution2(int[] num_list) {
        int result1 = Arrays.stream(num_list).reduce(1, (acc, i) -> acc * i);
        int result2 = Arrays.stream(num_list).reduce(0, (acc, i) -> acc + i);
        return result1 > Math.pow(result2, 2) ? 0 : 1;

    }

    public static void main(String[] args) {
        Lv0_원소들의곱과합 result = new Lv0_원소들의곱과합();
        System.out.println(result.solution(new int[] {3, 4, 5, 2, 1}));
        System.out.println(result.solution(new int[] {5, 7, 8, 3}));
    }
}
