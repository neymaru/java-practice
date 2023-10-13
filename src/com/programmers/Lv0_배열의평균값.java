package com.programmers;

import java.util.Arrays;

public class Lv0_배열의평균값 {
    public double solution(int[] numbers) {
        double sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum / numbers.length;
    }

    public double solution2(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(9);
    }

    public static void main(String[] args) {
        Lv0_배열의평균값 result = new Lv0_배열의평균값();
        System.out.println(result.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(result.solution2(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));
    }
}
