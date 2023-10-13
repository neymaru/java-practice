package com.programmers;

import java.util.Arrays;

public class Lv0_머쓱이보다키큰사람 {
    // 1. for문 사용
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int i : array) {
            answer += i > height ? 1 : 0;
        }
        return answer;
    }

    public int solution2(int[] array, int height) {
        return (int) Arrays.stream(array).filter(i -> i > height).count();
    }

    // 2. stream 사용
    public static void main(String[] args) {
        Lv0_머쓱이보다키큰사람 result = new Lv0_머쓱이보다키큰사람();
        System.out.println(result.solution(new int[] {149, 180, 192, 170}, 167));
        System.out.println(result.solution2(new int[] {180, 120, 140}, 190));
    }
}