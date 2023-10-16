package com.programmers;

public class Lv0_짝수홀수개수 {
    public int[] solution(int[] num_list) {
        int[] answer = {0, 0};
        for (int i : num_list) {
            if (i % 2 == 0) answer[0] += 1;
            else answer[1] += 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv0_짝수홀수개수 result = new Lv0_짝수홀수개수();
        System.out.println(result.solution(new int[] {1, 2, 3, 4, 5}));
        System.out.println(result.solution(new int[] {1, 3, 5, 7}));
    }
}