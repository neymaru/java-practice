package com.programmers;

public class Lv0_A강조하기 {
    public String solution(String myString) {
        return myString.toLowerCase().replaceAll("a", "A");
    }

    public static void main(String[] args) {
        Lv0_A강조하기 result = new Lv0_A강조하기();
        System.out.println(result.solution("abstract algebra"));
        System.out.println(result.solution("PrOgRaMmErS"));
    }
}