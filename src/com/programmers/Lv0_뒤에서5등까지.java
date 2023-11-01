package com.programmers;
import java.util.Arrays;
public class Lv0_뒤에서5등까지 {
    // 방법1
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        for (int i = 0; i < num_list.length; i++) {
            for (int j = i + 1; j < num_list.length; j++) {
                if (num_list[i] > num_list[j]) {
                    int tmp = num_list[i];
                    num_list[i] = num_list[j];
                    num_list[j] = tmp;
                }
            }
        }
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }

    // 방법2
    public int[] solution2(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 0, 5);
    }

    public static void main(String[] args) {
        Lv0_뒤에서5등까지 result = new Lv0_뒤에서5등까지();
        System.out.println(result.solution(new int[] {12, 4, 15, 46, 38, 1, 14}));
    }
}
