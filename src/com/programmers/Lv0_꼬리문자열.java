package com.programmers;

import java.util.Arrays;

public class Lv0_꼬리문자열 {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for (String s : str_list) {
            if (!s.contains(ex)) {
                answer += s;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv0_꼬리문자열 result = new Lv0_꼬리문자열();
        System.out.println(result.solution(new String[] {"abc", "def", "ghi"}, "ef"));
        System.out.println(result.solution(new String[] {"abc", "bbc", "cbc"}, "c"));
    }
}