package com.programmers;

public class Lv0_n의배수 {
    public int solution(int num, int n) {
        return num % n == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        Lv0_n의배수 result = new Lv0_n의배수();
        System.out.println(result.solution(98,	2));
        System.out.println(result.solution(34,	3));
    }
}
