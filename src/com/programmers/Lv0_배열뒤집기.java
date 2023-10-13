package com.programmers;

import java.util.Arrays;

public class Lv0_배열뒤집기 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i += 1) {
            answer[i] = num_list[num_list.length - i - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv0_배열뒤집기 result = new Lv0_배열뒤집기();
        System.out.println(Arrays.toString(result.solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(result.solution(new int[]{1, 1, 1, 1, 1, 2})));
        System.out.println(Arrays.toString(result.solution(new int[]{1, 0, 1, 1, 1, 3, 5})));
    }
}
