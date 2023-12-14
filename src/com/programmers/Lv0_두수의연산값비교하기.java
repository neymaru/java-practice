package com.programmers;

public class Lv0_두수의연산값비교하기 {
    public int solution(int a, int b) {
        return Math.max(Integer.parseInt(Integer.toString(a) + Integer.toString(b)), 2 * a * b);
    }

    public static void main(String[] args) {
        Lv0_두수의연산값비교하기 result = new Lv0_두수의연산값비교하기();
        System.out.println(result.solution(2, 91));
        System.out.println(result.solution(91, 2));
    }
}
