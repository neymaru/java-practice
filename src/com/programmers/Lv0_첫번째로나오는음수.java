package com.programmers;

public class Lv0_첫번째로나오는음수 {
    public int solution(int[] num_list) {
        int answer = -1;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv0_첫번째로나오는음수 result = new Lv0_첫번째로나오는음수();
        System.out.println(result.solution(new int[]{12, 4, 15, 46, 38, -2, 15}));
        System.out.println(result.solution(new int[]{13, 22, 53, 24, 15, 6}));
    }
}
