package com.programmers;

public class Lv0_문자열뒤집기 {
    // 1. for문 사용
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i += 1) {
            answer += my_string.charAt(my_string.length() - i - 1);
        }
        return answer;
    }

    // 2. StringBuilder 사용
    public String solution2(String my_string) {
        return new StringBuilder(my_string).reverse().toString();
    }

    public static void main(String[] args) {
        Lv0_문자열뒤집기 result = new Lv0_문자열뒤집기();
        System.out.println(result.solution("jaron"));
        System.out.println(result.solution2("bread"));
    }
}