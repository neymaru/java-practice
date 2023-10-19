package com.programmers;

public class Lv0_아이스아메리카노 {
    public int[] solution(int money) {
        return new int[] {money / 5500, money % 5500};
    }

    public static void main(String[] args) {
        Lv0_아이스아메리카노 result = new Lv0_아이스아메리카노();
        System.out.println(result.solution(5500));
        System.out.println(result.solution(15000));
    }
}