package com.programmers;

public class Lv0_접두사인지확인하기 {
    // 방법1
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        for (int i = 1; i < my_string.length(); i++) {
            if (my_string.substring(0, i).equals(is_prefix)) {
                answer = 1;
            }
        }
        return answer;
    }

    // 방법2
    public int solution2(String my_string, String is_prefix) {
        return my_string.startsWith(is_prefix) ? 1 : 0;
    }

    // 방법3
    public int solution3(String my_string, String is_prefix) {
        return my_string.indexOf(is_prefix) == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        Lv0_접두사인지확인하기 result = new Lv0_접두사인지확인하기();
        System.out.println(result.solution("banana", "ban"));
        System.out.println(result.solution("banana", "nan"));
        System.out.println(result.solution("banana", "abcd"));
        System.out.println(result.solution("banana", "bananan"));
    }
}
