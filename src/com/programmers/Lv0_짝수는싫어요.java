package com.programmers;

import java.util.stream.IntStream;

public class Lv0_짝수는싫어요 {
    public int[] solution(int n) {
        // 1. for문 사용
        int len = n % 2 == 0 ? n / 2 : n / 2 + 1;
        int[] answer = new int[len];
        int idx = 0;
        for (int i = 1; i <= n; i += 1) {
            if (i % 2 != 0) {
                answer[idx] = i;
                idx += 1;
            }
        }
        return answer;
    }

    // 2. IntStream.rangeClosed 사용
    public int[] solution2(int n) {
        return IntStream.rangeClosed(0, n).filter(el -> el % 2 != 0).toArray();
    }

    public static void main(String[] args) {
        Lv0_짝수는싫어요 result = new Lv0_짝수는싫어요();
        System.out.println(result.solution(10));
        System.out.println(result.solution2(15));
    }
}