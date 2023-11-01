package com.programmers;

public class Lv0_소문자로바꾸기 {
    public String solution(String myString) {
        return myString.toLowerCase();
    }

    public static void main(String[] args) {
        Lv0_소문자로바꾸기 result = new Lv0_소문자로바꾸기();
        System.out.println(result.solution("aBcDeFg"));
        System.out.println(result.solution("aaa"));
    }
}
