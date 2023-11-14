package com.programmers;

public class Lv0_홀수vs짝수 {
    public int solution(int[] num_list) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                sumEven += num_list[i];
            } else {
                sumOdd += num_list[i];
            }
        }
        return Math.max(sumEven, sumOdd);
    }

    public static void main(String[] args) {
        Lv0_홀수vs짝수 result = new Lv0_홀수vs짝수();
        System.out.println(result.solution(new int[] {4, 2, 6, 1, 7, 6}));
        System.out.println(result.solution(new int[] {-1, 2, 5, 6, 3}));
    }
}