package com.programmers;

import java.util.Arrays;

public class Lv0_최댓값만들기 {
    public int solution(int[] numbers) {
        int len = numbers.length;
        Arrays.sort(numbers);
        return numbers[len-1] * numbers[len - 2];
    }

    public static void main(String[] args) {
        Lv0_최댓값만들기 result = new Lv0_최댓값만들기();
        System.out.println(result.solution(new int[]{1, 2, 3, 4, 5}));
        System.out.println(result.solution(new int[]{0, 31, 24, 10, 1, 9}));
    }
}