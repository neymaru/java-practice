package com.programmers;
import java.util.stream.IntStream;

public class Lv0_순서바꾸기 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int idx = 0;
        for (int i = n; i < n + num_list.length; i++) {
            answer[idx] = num_list[i % num_list.length];
            idx += 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv0_순서바꾸기 result = new Lv0_순서바꾸기();
        System.out.println(result.solution(new int[] {2, 1, 6}, 1));
        System.out.println(result.solution(new int[] {5, 2, 1, 7, 5}, 3));
    }
}
