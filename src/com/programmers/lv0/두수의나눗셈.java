package com.programmers.lv0;

public class 두수의나눗셈 {
    public int solution(int num1, int num2) {
        return (int) ((double) num1 / num2 * 1000);
    }

    public static void main(String[] args) {
        두수의나눗셈 result = new 두수의나눗셈();
        System.out.println(result.solution(3, 2));
        System.out.println(result.solution(7, 3));
        System.out.println(result.solution(1, 16));
    }
}
