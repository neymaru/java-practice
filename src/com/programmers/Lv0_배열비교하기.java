package com.programmers;

import java.util.Arrays;

public class Lv0_배열비교하기 {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if (arr1.length == arr2.length) {
            int arr1Sum = Arrays.stream(arr1).reduce(0, Integer::sum);
            int arr2Sum = Arrays.stream(arr2).reduce(0, Integer::sum);
            answer = arr1Sum == arr2Sum ? 0 : arr1Sum > arr2Sum ? 1 : -1;
        } else {
            answer = arr1.length > arr2.length ? 1 : -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv0_배열비교하기 result = new Lv0_배열비교하기();
        System.out.println(result.solution(new int[]{49, 13}, new int[]{70, 11, 2}));
        System.out.println(result.solution(new int[]{100, 17, 84, 1}, new int[]{55, 12, 65, 36}));
        System.out.println(result.solution(new int[]{1, 2, 3, 4, 5}, new int[]{3, 3, 3, 3, 3}));
    }
}
