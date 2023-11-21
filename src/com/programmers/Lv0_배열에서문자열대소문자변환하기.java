package com.programmers;

import java.util.Arrays;

public class Lv0_배열에서문자열대소문자변환하기 {
    public String[] solution(String[] strArr) {
        for(int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                strArr[i] = strArr[i].toLowerCase();
            }
            else {
                strArr[i] = strArr[i].toUpperCase();
            }
        }
        return strArr;
    }
    public static void main(String[] args) {
        Lv0_배열에서문자열대소문자변환하기 result = new Lv0_배열에서문자열대소문자변환하기();
        System.out.println(result.solution(new String[]{"AAA","BBB","CCC","DDD"}));
        System.out.println(result.solution(new String[]{"aBc","AbC"}));
    }
}
