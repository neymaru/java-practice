package com.programmers;

import java.util.Arrays;

public class Lv0_14_중복된숫자개수 {
    // 1. for문 사용
    public int solution1(int[] array, int n) {
        int answer = 0;
        for (int i : array) {
            if (i == n) answer += 1;
        }
        return answer;
    }

    // 2. stream 사용
    public int solution2(int[] array, int n) {
        return (int) Arrays.stream(array).filter((el) -> el == n).count();
    }


    public static void main(String[] args) {
        Lv0_14_중복된숫자개수 result = new Lv0_14_중복된숫자개수();
        System.out.println(result.solution1(new int[]{1, 1, 2, 3, 4, 5}, 1));
        System.out.println(result.solution2(new int[]{0, 2, 3, 4}, 1));
    }
}
