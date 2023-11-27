package com.programmers;

import java.util.Scanner;

public class Lv0_문자열바꿔서찾기 {
    public int solution(String myString, String pat) {
        String myString2 = myString.replaceAll("A", "C");
        String myString3 = myString2.replaceAll("B", "A");
        String myString4 = myString3.replaceAll("C", "B");
        return myString4.contains(pat) ? 1 : 0;
    }

    public static void main(String[] args) {
        Lv0_문자열바꿔서찾기 result = new Lv0_문자열바꿔서찾기();
        System.out.println(result.solution("ABBAA", "AABB"));
        System.out.println(result.solution("ABAB", "ABAB"));
    }
}
