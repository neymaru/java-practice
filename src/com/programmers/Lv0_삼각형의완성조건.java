package com.programmers;

import java.util.Arrays;

public class Lv0_삼각형의완성조건 {

    // 1. for문 사용
    public int solution(int[] sides) {
        for (int i = 0; i < sides.length; i += 1) {
            for (int j = i + 1; j < sides.length; j += 1) {
                if (sides[i] > sides[j]) {
                    int tmp = sides[i];
                    sides[i] = sides[j];
                    sides[j] = tmp;
                }
            }
        }
        return sides[2] < sides[0] + sides[1] ? 1 : 2;
    }

    public int solution2(int[] sides) {
        Arrays.sort(sides);
        return sides[2] < (sides[0] + sides[1]) ? 1 : 2;
    }

    // 2. Arrays, sort 사용
    public static void main(String[] args) {
        Lv0_삼각형의완성조건 result = new Lv0_삼각형의완성조건();
        System.out.println(result.solution(new int[] {1, 2, 3}));
        System.out.println(result.solution(new int[] {3, 6, 2}));
        System.out.println(result.solution2(new int[] {199, 72, 222}));
    }
}