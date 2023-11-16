package com.programmers;

import java.util.Arrays;

public class Lv0_원하는문자열찾기 {
    public int solution(String myString, String pat) {
        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }

    public static void main(String[] args) {
        Lv0_원하는문자열찾기 result = new Lv0_원하는문자열찾기();
        System.out.println(result.solution("AbCdEfG", "aBc"));
        System.out.println(result.solution("aaAA", "aaaaa"));
    }
}
