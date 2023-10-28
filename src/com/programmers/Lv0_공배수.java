package com.programmers;

public class Lv0_공배수 {
    public int solution(int number, int n, int m) {
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        Lv0_공배수 result = new Lv0_공배수();
        System.out.println(result.solution(60, 2, 3));
        System.out.println(result.solution(55, 10, 5));
    }
}
