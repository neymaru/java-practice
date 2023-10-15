package com.programmers;

import java.util.Arrays;

public class Lv0_배열자르기 {
    // 방법1
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        for (int i = 0; i < answer.length; i += 1) {
            answer[i] = numbers[num1];
            num1 += 1;
        }
        return answer;
    }

    // 방법2
    public int[] solution2(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }

    // 방법2
    public int[] solution3(int[] numbers, int num1, int num2) {
        return Arrays.stream(numbers, num1, num2 + 1).toArray();
    }

    public static void main(String[] args) {
        Lv0_배열자르기 result = new Lv0_배열자르기();
        System.out.println(result.solution(new int[]{1, 2, 3, 4, 5}, 1, 3));
        System.out.println(result.solution2(new int[]{1, 3, 5}, 1, 2));
    }
}