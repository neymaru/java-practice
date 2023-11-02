package com.programmers;

public class Lv0_문자열의뒤의n글자 {
    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }

    public static void main(String[] args) {
        Lv0_문자열의뒤의n글자 result = new Lv0_문자열의뒤의n글자();
        System.out.println(result.solution("ProgrammerS123", 11));
        System.out.println(result.solution("He110W0r1d", 5));
    }
}
