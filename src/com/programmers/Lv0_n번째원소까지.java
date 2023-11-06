package com.programmers;

import java.util.Arrays;

public class Lv0_n번째원소까지 {
    // 1. for문 사용
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }

    // 2. copyOfRange 사용
    public int[] solution2(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, 0, n);
    }

    public static void main(String[] args) {
        Lv0_n번째원소까지 result = new Lv0_n번째원소까지();
        System.out.println(result.solution(new int[]{2, 1, 6}, 1));
        System.out.println(result.solution2(new int[]{5, 2, 1, 7, 5}, 3));
    }
}
