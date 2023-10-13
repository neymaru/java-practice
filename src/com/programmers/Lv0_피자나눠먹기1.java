package com.programmers;

public class Lv0_피자나눠먹기1 {
    public int solution(int n) {
        return n % 7 == 0 ? n / 7 : n / 7 + 1;
    }

    public static void main(String[] args) {
        Lv0_피자나눠먹기1 result = new Lv0_피자나눠먹기1();
        System.out.println(result.solution(7));
        System.out.println(result.solution(1));
        System.out.println(result.solution(15));
    }
}