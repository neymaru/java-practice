package com.programmers;

import java.util.Arrays;

public class Lv0_n번째원소부터 {
    // 1. for문 사용
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - (n - 1)];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[n + i - 1];
        }
        return answer;
    }

    // 2. copyOfRange 사용
    public int[] solution2(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, n - 1, num_list.length);
    }

    public static void main(String[] args) {
        Lv0_n번째원소부터 result = new Lv0_n번째원소부터();
        System.out.println(result.solution(new int[]{2, 1, 6}, 3));
        System.out.println(result.solution2(new int[]{5, 2, 1, 7, 5}, 2));
    }
}
