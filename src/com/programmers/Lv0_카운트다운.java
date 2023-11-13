package com.programmers;

import java.util.stream.IntStream;

public class Lv0_카운트다운 {
    // 방법1
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int [start_num - end_num + 1];
        for (int i = 0; i <= start_num - end_num; i++) {
            answer[i] = start_num - i;
        }
        return answer;
    }

    // 방법2
    public int[] solution2(int start_num, int end_num) {
        return IntStream.rangeClosed(-start_num, -end_num).map(i -> -i).toArray();
    }

    public static void main(String[] args) {
        Lv0_카운트다운 result = new Lv0_카운트다운();
        System.out.println(result.solution(10, 3));
    }
}