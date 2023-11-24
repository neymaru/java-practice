package com.programmers;

import java.util.*;
import java.util.stream.IntStream;

public class Lv0_배열만들기1 {
    public int[] solution(int n, int k) {
        int count = (int) n / k;
        int[] answer = new int[count];
        for (int i = 1; i <= count; i++) {
            answer[i - 1] = i * k;
        }
        return answer;
    }

    public int[] solution2(int n, int k) {
        return IntStream.rangeClosed(1, n).filter(i -> i % k == 0).toArray();
    }

    public int[] solution3(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Lv0_배열만들기1 result = new Lv0_배열만들기1();
        System.out.println(result.solution(10, 3));
        System.out.println(result.solution(15, 5));
    }
}
