package com.programmers;

import java.util.Arrays;

public class Lv0_자릿수더하기 {
    // 1. for문 사용
//    public int solution(int n) {
//        String str = Integer.toString(n);
//        String[] arr = str.split("");
//        int answer = 0;
//        for (String c : arr) {
//            answer += Integer.parseInt(c);
//        }
//        return answer;
//    }

    // 2. while문 사용
//    public int solution(int n) {
//        int answer = 0;
//        while (n > 0) {
//            answer += (n % 10);
//            n /= 10;
//        }
//        return answer;
//    }

    // 3. stream, mapToInt 사용
    public int solution(int n) {
        return Arrays.stream(Integer.toString(n).split("")).mapToInt(Integer::parseInt).sum();
    }

    public static void main(String[] args) {
        Lv0_자릿수더하기 result = new Lv0_자릿수더하기();
        System.out.println(result.solution(1234));
        System.out.println(result.solution(930211));
    }
}