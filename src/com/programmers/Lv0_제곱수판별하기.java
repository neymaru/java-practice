package com.programmers;

public class Lv0_제곱수판별하기 {
    public int solution(int n) {
        int i = 1;
        while (i * i < n) {
            i += 1;
            if (i * i == n)
                return 1;
        }
        return 2;
    }

    public static void main(String[] args) {
        Lv0_제곱수판별하기 result = new Lv0_제곱수판별하기();
        System.out.println(result.solution(144));
        System.out.println(result.solution(976));
    }
}