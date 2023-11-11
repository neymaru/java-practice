package com.programmers;

public class Lv0_마지막두원소 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            System.arraycopy(num_list, 0, answer, 0, num_list.length);
            answer[num_list.length] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            System.arraycopy(num_list, 0, answer, 0, num_list.length);
            answer[num_list.length] = num_list[num_list.length - 1] * 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv0_마지막두원소 result = new Lv0_마지막두원소();
        System.out.println(result.solution(new int[] {2, 1, 6}));
        System.out.println(result.solution(new int[] {5, 2, 1, 7, 5}));
    }
}