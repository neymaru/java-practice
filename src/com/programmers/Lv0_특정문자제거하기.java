package com.programmers;

import java.util.Arrays;

public class Lv0_특정문자제거하기 {
    public String solution(String my_string, String letter) {
        return my_string.replaceAll(letter, "");
    }

    public static void main(String[] args) {
        Lv0_특정문자제거하기 result = new Lv0_특정문자제거하기();
        System.out.println(result.solution("abcdef", "f"));
        System.out.println(result.solution("BCBdbe", "B"));
    }
}