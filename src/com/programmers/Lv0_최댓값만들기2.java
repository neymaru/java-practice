package com.programmers;
import java.util.Arrays;
public class Lv0_최댓값만들기2 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[numbers.length - 1] * numbers[numbers.length - 2]);
    }

    public static void main(String[] args) {
        Lv0_최댓값만들기2 result = new Lv0_최댓값만들기2();
        System.out.println(result.solution(new int[] {1, 2, -3, 4, -5}));
        System.out.println(result.solution(new int[] {0, -31, 24, 10, 1, 9}));
        System.out.println(result.solution(new int[] {10, 20, 30, 5, 5, 20, 5}));
    }
}