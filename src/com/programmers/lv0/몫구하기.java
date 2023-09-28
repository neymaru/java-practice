package com.programmers.lv0;

public class 몫구하기 {
    public int solution(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        몫구하기 result = new 몫구하기();
        System.out.println(result.solution(10, 5));
        System.out.println(result.solution(7, 2));
    }
}
