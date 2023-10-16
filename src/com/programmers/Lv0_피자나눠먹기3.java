package com.programmers;

public class Lv0_피자나눠먹기3 {
    // 1. 방법1
    public int solution(int slice, int n) {
        return n % slice == 0 ? n / slice : n / slice + 1;
    }

    // 2. Math.ceil 사용
    public int solution2(int slice, int n) {
        return (int) Math.ceil(n * 1.0 / slice);
    }

    public static void main(String[] args) {
        Lv0_피자나눠먹기3 result = new Lv0_피자나눠먹기3();
        System.out.println(result.solution(7, 10));
        System.out.println(result.solution2(4, 12));
    }
}