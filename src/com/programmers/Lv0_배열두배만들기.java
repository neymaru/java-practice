package com.programmers;

import java.util.Arrays;

public class Lv0_배열두배만들기 {
    
    // 1. for문 사용
    public int[] solution(int[] numbers) {
        for (int i = 0; i < numbers.length; i += 1) {
            numbers[i] *= 2;
        }
        return numbers;
    }

    // 2. stream 사용
    public int[] solution2(int[] numbers) {
        return Arrays.stream(numbers).map(el -> el * 2).toArray();
    }


    public static void main(String[] args) {
        Lv0_배열두배만들기 result = new Lv0_배열두배만들기();
        System.out.println(Arrays.toString(result.solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(result.solution2(new int[]{1, 2, 100, -99, 1, 2, 3})));
    }
}
