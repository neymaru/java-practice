package com.programmers;
import java.util.*;
public class Lv0_콜라츠수열만들기 {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while(n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                list.add(n);
            } else {
                n = 3 * n + 1;
                list.add(n);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Lv0_콜라츠수열만들기 result = new Lv0_콜라츠수열만들기();
        System.out.println(result.solution(10));
    }
}