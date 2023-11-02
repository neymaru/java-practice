package com.programmers;

public class Lv0_문자열을정수로변환하기 {
    public int solution(String n_str) {
        return Integer.parseInt(n_str);
    }

    public static void main(String[] args) {
        Lv0_문자열을정수로변환하기 result = new Lv0_문자열을정수로변환하기();
        System.out.println(result.solution("10"));
        System.out.println(result.solution("8542"));
    }
}
