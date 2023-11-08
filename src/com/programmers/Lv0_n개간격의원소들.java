package com.programmers;

import java.util.Arrays;

public class Lv0_n개간격의원소들 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[(int) Math.ceil((double) num_list.length / n)];
        int idx = 0;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[idx];
            idx += n;
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv0_n개간격의원소들 result = new Lv0_n개간격의원소들();
        System.out.println(result.solution(new int[] {4, 2, 6, 1, 7, 6}, 2));
    }
}
