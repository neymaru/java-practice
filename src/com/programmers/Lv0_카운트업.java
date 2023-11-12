package com.programmers;

import java.util.stream.IntStream;

public class Lv0_카운트업 {
    // 방법1
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];
        for (int i = 0; i <= end_num - start_num; i++) {
            answer[i] = i + start_num;
        }
        return answer;
    }

    // 방법2
    public int[] solution2(int start_num, int end_num) {
        return IntStream.rangeClosed(start_num, end_num).toArray();
    }

    public static void main(String[] args) {
        Lv0_카운트업 result = new Lv0_카운트업();
        System.out.println(result.solution(3, 10));
    }
}