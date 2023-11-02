package com.programmers;

public class Lv0_문자열곱하기 {
    public String solution(String my_string, int k) {
        return my_string.repeat(k);
    }

    public static void main(String[] args) {
        Lv0_문자열곱하기 result = new Lv0_문자열곱하기();
        System.out.println(result.solution("string", 3));
        System.out.println(result.solution("love",	10));
    }
}
