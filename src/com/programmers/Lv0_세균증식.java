package com.programmers;

public class Lv0_세균증식 {
    public int solution(int n, int t) {
        int answer = n;
        for (int i = 0; i < t; i += 1) {
            answer = answer * 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv0_세균증식 result = new Lv0_세균증식();
        System.out.println(result.solution(2, 10));
        System.out.println(result.solution(7, 15));
    }
}