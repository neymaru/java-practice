package com.programmers;

import java.util.Arrays;

public class Lv0_n보다커질때까지더하기 {
    // 1. for문 사용
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int i : numbers) {
            answer += i;
            if (answer > n)
                break;
        }
        return answer;
    }

    // stream, reduce 사용
    public int solution2(int[] numbers, int n) {
        return Arrays.stream(numbers).reduce(0, (sum, i) -> sum > n ? sum : sum + i);
    }


    public static void main(String[] args) {
        Lv0_n보다커질때까지더하기 result = new Lv0_n보다커질때까지더하기();
        System.out.println(result.solution(new int[]{34, 5, 71, 29, 100, 34}, 123));
        System.out.println(result.solution(new int[]{58, 44, 27, 10, 100}, 139));
    }
}
