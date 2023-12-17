package com.programmers;

import java.util.Arrays;

public class Lv0_주사위의개수 {
    public int solution(int[] box, int n) {
        return (box[0]/n) * (box[1]/n) * (box[2]/n);
    }
    public static void main(String[] args) {
        Lv0_주사위의개수 result = new Lv0_주사위의개수();
        System.out.println(result.solution(new int[]{1, 1, 1}, 1));
        System.out.println(result.solution(new int[]{10, 8, 6}, 3));
    }
}
