package com.programmers;

import java.util.Arrays;

public class Lv0_배열원소의길이 {
    // 1. for문 사용
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i += 1) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }

    public int[] solution2(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }

    // 2. stream 사용
    public static void main(String[] args) {
        Lv0_배열원소의길이 result = new Lv0_배열원소의길이();
        System.out.println(result.solution(new String[]{"We", "are", "the", "world!"}));
        System.out.println(result.solution2(new String[]{"I", "Love", "Programmers."}));
    }
}
