package com.programmers;

public class Lv0_숨어있는숫자의덧셈1 {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[^0-9]", "");
        for (int i = 0; i < my_string.length(); i += 1) {
            answer += Integer.parseInt(my_string.substring(i, i + 1));
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv0_숨어있는숫자의덧셈1 result = new Lv0_숨어있는숫자의덧셈1();
        System.out.println(result.solution("aAb1B2cC34oOp"	));
        System.out.println(result.solution("1a2b3c4d123"));
    }
}