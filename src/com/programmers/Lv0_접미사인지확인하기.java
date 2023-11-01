package com.programmers;

public class Lv0_접미사인지확인하기 {
    // 방법1
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        for (int i = my_string.length() - 1; i >= 0; i--) {
            if (my_string.substring(i, my_string.length()).equals(is_suffix)) {
                answer = 1;
            }
        }
        return answer;
    }

    // 방법2
    public int solution2(String my_string, String is_suffix) {
        return my_string.endsWith(is_suffix) ? 1 : 0;
    }

    public static void main(String[] args) {
        Lv0_접미사인지확인하기 result = new Lv0_접미사인지확인하기();
        System.out.println(result.solution("banana", "ana"));
        System.out.println(result.solution("banana", "nan"));
        System.out.println(result.solution("banana", "wxyz"));
        System.out.println(result.solution("banana", "abanana"));
    }
}
