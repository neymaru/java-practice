package com.programmers;

import java.util.Arrays;

public class Lv0_15_편지 {
    public int solution(String message) {
        return message.length() * 2;
    }

    public static void main(String[] args) {
        Lv0_15_편지 result = new Lv0_15_편지();
        System.out.println(result.solution("happy birthday!"));
        System.out.println(result.solution("I love you~"));
    }
}
