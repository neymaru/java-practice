package com.programmers;

public class Lv0_점의위치구하기 {
    public int solution(int[] dot) {
        return (dot[0] > 0 ? (dot[1] > 0 ? 1 : 4) : dot[1] > 0 ? 2 : 3);
    }

    public static void main(String[] args) {
        Lv0_점의위치구하기 result = new Lv0_점의위치구하기();
        System.out.println(result.solution(new int[]{2, 4}));
        System.out.println(result.solution(new int[]{-7, 9}));
    }
}
