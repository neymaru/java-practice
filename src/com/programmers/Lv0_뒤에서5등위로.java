package com.programmers;
import java.util.Arrays;

public class Lv0_뒤에서5등위로 {
    // 방법1
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];
        for (int i = 0; i < num_list.length; i++) {
            for (int j = i + 1; j < num_list.length; j++) {
                if (num_list[i] > num_list[j]) {
                    int tmp = num_list[i];
                    num_list[i] = num_list[j];
                    num_list[j] = tmp;
                }
            }
        }
        for (int i = 5; i < num_list.length; i++) {
            answer[i - 5] = num_list[i];
        }
        return answer;
    }

    // 방법2
    public int[] solution2(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 5, num_list.length);
    }

    public static void main(String[] args) {
        Lv0_뒤에서5등위로 result = new Lv0_뒤에서5등위로();
        System.out.println(result.solution(new int[] {12, 4, 15, 46, 38, 1, 14, 56, 32, 10}));
    }
}
