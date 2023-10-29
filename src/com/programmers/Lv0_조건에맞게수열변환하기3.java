package com.programmers;

import java.util.Arrays;

public class Lv0_조건에맞게수열변환하기3 {
    // 1. for문 사용
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i += 1) {
            answer[i] = k % 2 == 1 ? arr[i] * k : arr[i] + k;
        }
        return answer;
    }

    public int[] solution2(int[] arr, int k) {
        return Arrays.stream(arr).map(el -> k % 2 == 1 ? el * k : el + k).toArray();
    }

    // 2. stream, map 사용
    public static void main(String[] args) {
        Lv0_조건에맞게수열변환하기3 result = new Lv0_조건에맞게수열변환하기3();
        System.out.println(result.solution(new int[]{1, 2, 3, 100, 99, 98}, 3));
        System.out.println(result.solution2(new int[]{1, 2, 3, 100, 99, 98}, 2));
    }
}