package com.programmers;

public class Lv0_정수부분 {
    public int solution(double flo) {
        return (int) flo;
    }

    public static void main(String[] args) {
        Lv0_정수부분 result = new Lv0_정수부분();
        System.out.println(result.solution(1.42));
        System.out.println(result.solution(69.32));
    }
}