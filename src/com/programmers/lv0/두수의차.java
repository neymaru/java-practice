package com.programmers.lv0;

public class 두수의차 {
    public int solution(int num1, int num2) {
        return num1 - num2;
    }

    public static void main(String[] args) {
        두수의차 result = new 두수의차();
        System.out.println(result.solution(2, 3));
        System.out.println(result.solution(100, 2));
    }
}
