package com.programmers;

public class Lv0_05_두수의차 {
    public int solution(int num1, int num2) {
        return num1 - num2;
    }

    public static void main(String[] args) {
        Lv0_05_두수의차 result = new Lv0_05_두수의차();
        System.out.println(result.solution(2, 3));
        System.out.println(result.solution(100, 2));
    }
}
