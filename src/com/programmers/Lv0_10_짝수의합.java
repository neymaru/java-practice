package com.programmers;

public class Lv0_10_짝수의합 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i += 1) {
            if (i % 2 == 0) answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
    Lv0_10_짝수의합 result = new Lv0_10_짝수의합();
        System.out.println(result.solution(10));
        System.out.println(result.solution(4));
    }

}
