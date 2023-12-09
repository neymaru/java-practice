package com.programmers;

public class Lv0_대문자와소문자 {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            String s = Character.toString(my_string.charAt(i));
            answer += s.matches("[a-z]") ? s.toUpperCase() : s.toLowerCase();
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv0_대문자와소문자 result = new Lv0_대문자와소문자();
        System.out.println(result.solution("cccCCC"));
        System.out.println(result.solution("abCdEfghIJ"));
    }
}
