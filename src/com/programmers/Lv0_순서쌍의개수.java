package com.programmers;
import java.util.stream.IntStream;

public class Lv0_순서쌍의개수 {
    // 1. for문 사용
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i += 1) {
            if (n % i == 0) answer += 1;
        }
        return answer;
    }

    // 2. stream 사용
    public int solution2(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }

    // range: 시작값 부터 종료값 직전 까지
    // rangeClosed: 시작값 부터 종료값 까지

    public static void main(String[] args) {
        Lv0_순서쌍의개수 result = new Lv0_순서쌍의개수();
        System.out.println(result.solution(20));
        System.out.println(result.solution2(100));
    }
}
