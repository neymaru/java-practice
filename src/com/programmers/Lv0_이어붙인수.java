package com.programmers;

import java.util.Arrays;

public class Lv0_이어붙인수 {
    public int solution(int[] num_list) {
        String odd = "";
        String even = "";
        for (int i : num_list) {
            if (i % 2 == 1) {
                odd += "" + i;
            }
            else {
                even += "" + i;
            }
        }
        return Integer.parseInt(odd) + Integer.parseInt(even);
    }

    public static void main(String[] args) {
        Lv0_이어붙인수 result = new Lv0_이어붙인수();
        System.out.println(result.solution(new int[] {3, 4, 5, 2, 1}));
        System.out.println(result.solution(new int[] {5, 7, 8, 3}));
    }
}