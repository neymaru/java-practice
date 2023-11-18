package com.programmers;

import java.util.*;

public class Lv0_배열의원소만큼추가하기 {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer.add(arr[i]);
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Lv0_배열의원소만큼추가하기 result = new Lv0_배열의원소만큼추가하기();
        System.out.println(result.solution(new int[]{5, 1, 4}));
    }
}