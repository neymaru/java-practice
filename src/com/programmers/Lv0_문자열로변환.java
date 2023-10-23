package com.programmers;

public class Lv0_문자열로변환 {
    // 방법1
    public String solution(int n) {
        return n + "";
    }

    // 방법2
    public String solution2(int n) {
        return Integer.toString(n);
    }

    // 방법3
    public String solution3(int n) {
        return String.valueOf(n);
    }

    public static void main(String[] args) {
        Lv0_문자열로변환 result = new Lv0_문자열로변환();
        System.out.println(result.solution(123));
        System.out.println(result.solution2(2573));
        System.out.println(result.solution2(12345));
    }
}
