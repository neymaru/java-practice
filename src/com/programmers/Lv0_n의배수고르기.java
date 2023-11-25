package com.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv0_n의배수고르기 {
    public int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(i -> i % n == 0).toArray();
    }

    public int[] solution2(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        for (int i : numlist) {
            if (i % n == 0) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Lv0_n의배수고르기 result = new Lv0_n의배수고르기();
        System.out.println(result.solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12}));
        System.out.println(result.solution2(5, new int[]{1, 9, 3, 10, 13, 5}));
        System.out.println(result.solution(12, new int[]{2, 100, 120, 600, 12, 12}));
    }
}