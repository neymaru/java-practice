package com.programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lv0_배열의길이에따라다른연산하기 {
    public int[] solution(int[] arr, int n) {
        for (int i = arr.length % 2 == 1 ? 0 : 1; i < arr.length; i += 2) {
            arr[i] += n;
        }
        return arr;
    }

    public static void main(String[] args) {
        Lv0_배열의길이에따라다른연산하기 result = new Lv0_배열의길이에따라다른연산하기();
        System.out.println(result.solution(new int[]{49, 12, 100, 276, 33}, 27));
        System.out.println(result.solution(new int[]{444, 555, 666, 777}, 100));
    }
}
