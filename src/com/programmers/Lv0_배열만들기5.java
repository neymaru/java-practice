package com.programmers;

import java.util.*;

public class Lv0_배열만들기5 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> result = new ArrayList<>();
        for (String str : intStrs) {
            int i = Integer.parseInt(str.substring(s, s + l));
            if (i > k) {
                result.add(i);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Lv0_배열만들기5 result = new Lv0_배열만들기5();
        System.out.println(result.solution(new String[] {"0123456789", "9876543210", "9999999999999"}, 50000, 5, 5));
    }
}
