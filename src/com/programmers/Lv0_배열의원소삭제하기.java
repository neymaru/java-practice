package com.programmers;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Lv0_배열의원소삭제하기 {
    public int[] solution(int[] arr, int[] delete_list) {
        return IntStream.of(arr).filter(i -> !IntStream.of(delete_list).anyMatch(s -> s == i)).toArray();
    }

    public static void main(String[] args) {
        Lv0_배열의원소삭제하기 result = new Lv0_배열의원소삭제하기();
        System.out.println(result.solution(new int[]{293, 1000, 395, 678, 94}, new int[]{94, 777, 104, 1000, 1, 12}));
        System.out.println(result.solution(new int[]{110, 66, 439, 785, 1}, new int[]{377, 823, 119, 43}));
    }
}
