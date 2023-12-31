package com.programmers;

import java.util.Arrays;

public class Lv0_가장큰수찾기 {
    public int[] solution(int[] array) {
        int[] answer = {0, 0};
        for (int i = 0; i < array.length; i++) {
            if(array[i]>answer[0]) {
                answer[0]=array[i];
                answer[1]=i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv0_가장큰수찾기 result = new Lv0_가장큰수찾기();
        System.out.println(result.solution(new int[]{1, 8, 3}));
        System.out.println(result.solution(new int[]{9, 10, 11, 8}));
    }
}
