package com.programmers;

import java.util.Arrays;

public class Lv0_길이에따른연산 {
    // 1. for문 사용
    public int solution(int[] num_list) {
        int answer = num_list.length > 10 ? 0 : 1;
        for (int i : num_list) {
            if (num_list.length > 10)
                answer += i;
            else
                answer *= i;
        }
        return answer;
    }

    // 2. stream, reduce 사용
    public int solution2(int[] num_list) {
        if (num_list.length > 10)
            return Arrays.stream(num_list).reduce(0, Integer::sum);
        else
            return Arrays.stream(num_list).reduce(1, (x, y) -> x * y);
    }

    public static void main(String[] args) {
        Lv0_길이에따른연산 result = new Lv0_길이에따른연산();
        System.out.println(result.solution(new int[] {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1}));
        System.out.println(result.solution2(new int[] {2, 3, 4, 5}));
    }
}
