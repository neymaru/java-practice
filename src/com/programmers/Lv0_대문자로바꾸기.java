package com.programmers;

public class Lv0_대문자로바꾸기 {
    public String solution(String myString) {
        return myString.toUpperCase();
    }

    public static void main(String[] args) {
        Lv0_대문자로바꾸기 result = new Lv0_대문자로바꾸기();
        System.out.println(result.solution("aBcDeFg"));
        System.out.println(result.solution("AAA"));
    }
}
