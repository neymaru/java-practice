package com.programmers;

public class Lv0_숫자비교하기 {
    public int solution(int num1, int num2) {
        return (num1 == num2) ? 1 : -1;
    }

    public static void main(String[] args) {
        Lv0_숫자비교하기 result = new Lv0_숫자비교하기();
        System.out.println(result.solution(2, 3));
        System.out.println(result.solution(11, 11));
        System.out.println(result.solution(7, 99));
    }
}
