package com.programmers;

import java.util.Arrays;

public class Lv0_문자열정수의합 {
    // 1. for문 사용
    public int solution(String num_str) {
        String[] arr = num_str.split("");
        int answer = 0;
        for (String s : arr) {
            answer += Integer.parseInt(s);
        }
        return answer;
    }

    // 2. stream 사용
    public int solution2(String num_str) {
        return Arrays.stream(num_str.split("")).mapToInt(Integer::parseInt).sum();
    }

    public static void main(String[] args) {
        Lv0_문자열정수의합 result = new Lv0_문자열정수의합();
        System.out.println(result.solution("123456789"));
        System.out.println(result.solution2("1000000"));
    }
}