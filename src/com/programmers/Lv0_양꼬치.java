package com.programmers;

public class Lv0_양꼬치 {
    public int solution(int n, int k) {
        return (n * 12000) + (k * 2000) - (n / 10 * 2000);
    }

    public static void main(String[] args) {
        Lv0_양꼬치 result = new Lv0_양꼬치();
        System.out.println(result.solution(10, 3));
        System.out.println(result.solution(64, 6));
    }
}
