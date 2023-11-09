package com.programmers;

public class Lv0_홀짝에따라다른값반환하기 {
    public int solution(int n) {
        int answer = 0;
        if (n % 2 == 1) {
            for (int i = 1; i <= n; i += 2) {
                answer += i;
            }
        } else {
            for (int i = 2; i <= n; i += 2) {
                answer += (i * i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv0_홀짝에따라다른값반환하기 result = new Lv0_홀짝에따라다른값반환하기();
        System.out.println(result.solution(7));
        System.out.println(result.solution(10));
    }
}