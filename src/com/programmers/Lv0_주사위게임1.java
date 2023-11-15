package com.programmers;

import java.util.Arrays;

public class Lv0_주사위게임1 {
    public int solution(int a, int b) {
        int answer = 0;
        if (a % 2 == 1 && b % 2 == 1) {
            answer = (int) Math.pow(a, 2) + (int) Math.pow(b, 2);
        } else if (a % 2 == 0 && b % 2 == 0) {
            answer = Math.abs(a - b);
        } else {
            answer = 2 * (a + b);
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv0_주사위게임1 result = new Lv0_주사위게임1();
        System.out.println(result.solution(3, 5));
        System.out.println(result.solution(6, 1));
        System.out.println(result.solution(2, 4));
    }
}
