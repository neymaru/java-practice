package com.programmers;

public class Lv0_나머지구하기 {
    public int solution(int num1, int num2) {
        return num1 % num2;
    }

    public static void main(String[] args) {
        Lv0_나머지구하기 result = new Lv0_나머지구하기();
        System.out.println(result.solution(3, 2));
        System.out.println(result.solution(10, 5));
    }
}
