package com.programmers;

public class Lv0_가까운1찾기 {
    public int solution(int[] arr, int idx) {
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Lv0_가까운1찾기 result = new Lv0_가까운1찾기();
        System.out.println(result.solution(new int[]{0, 0, 0, 1}, 1));
        System.out.println(result.solution(new int[]{1, 0, 0, 1, 0, 0}, 4));
        System.out.println(result.solution(new int[]{1, 1, 1, 1, 0}, 3));
    }
}
