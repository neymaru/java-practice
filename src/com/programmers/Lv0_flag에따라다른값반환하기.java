package com.programmers;

import java.util.Arrays;

public class Lv0_flag에따라다른값반환하기 {
    public int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }

    public static void main(String[] args) {
        Lv0_flag에따라다른값반환하기 result = new Lv0_flag에따라다른값반환하기();
        System.out.println(result.solution(-4, 7, true));
        System.out.println(result.solution(-4, 7, false));
    }
}
