package com.programmers;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class Lv0_조건에맞게수열변환하기1 {
    // 1. for문 사용
    public int[] solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 & arr[i] % 2 == 0) {
                arr[i] /= 2;
            } else if (arr[i] < 50 & arr[i] % 2 == 1) {
                arr[i] *= 2;
            }
        }
        return arr;
    }

    // 2. stream, map 사용
    public int[] solution2(int[] arr) {
        return Arrays.stream(arr)
                .map((el) -> (el >= 50 && el % 2 == 0 ? el / 2 : el < 50 && el % 2 == 1 ? el * 2 : el))
                .toArray();
    }

    public static void main(String[] args) {
        Lv0_조건에맞게수열변환하기1 result = new Lv0_조건에맞게수열변환하기1();
        System.out.println(result.solution(new int[]{1, 2, 3, 100, 99, 98}));
    }
}