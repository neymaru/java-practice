package com.programmers;

import java.util.Arrays;

public class Lv0_글자이어붙여문자열만들기 {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        for(int i : index_list) {
            answer += my_string.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv0_글자이어붙여문자열만들기 result = new Lv0_글자이어붙여문자열만들기();
        System.out.println(result.solution("cvsgiorszzzmrpaqpe", new int[]{16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7}));
        System.out.println(result.solution("zpiaz", new int[]{1, 2, 0, 0, 3}));
    }
}
