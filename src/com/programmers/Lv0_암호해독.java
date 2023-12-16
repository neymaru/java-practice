package com.programmers;

public class Lv0_암호해독 {
    public String solution(String cipher, int code) {
        String answer = "";
        for (int i = code - 1; i < cipher.length(); i += code) {
            answer += cipher.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv0_암호해독 result = new Lv0_암호해독();
        System.out.println(result.solution("dfjardstddetckdaccccdegk", 4));
        System.out.println(result.solution("pfqallllabwaoclk", 2));
    }
}
