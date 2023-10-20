package com.programmers;

import java.util.Arrays;

public class Lv0_중앙값구하기 {
    // 1. for문 사용
    public int solution(int[] array) {
        int[] sortedArr = new int[array.length];
        for (int i = 0; i < array.length; i += 1) {
            for (int j = i + 1; j < array.length; j += 1) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array[array.length / 2];
    }

    // 2. Arrays, sort 사용
    public int solution2(int[] array) {
            Arrays.sort(array);
            return array[array.length / 2];
    }

    public static void main(String[] args) {
        Lv0_중앙값구하기 result = new Lv0_중앙값구하기();
        System.out.println(result.solution(new int[] {1, 2, 7, 10, 11}));
        System.out.println(result.solution(new int[] {9, -1, 0}));
    }
}