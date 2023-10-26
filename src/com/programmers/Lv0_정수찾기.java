package com.programmers;

public class Lv0_정수찾기 {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for (int i : num_list) {
            if (i == n) answer = 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv0_정수찾기 result = new Lv0_정수찾기();
        System.out.println(result.solution(new int[] {1, 2, 3, 4, 5}, 3));
        System.out.println(result.solution(new int[] {15, 98, 23, 2, 15}, 20));
    }
}