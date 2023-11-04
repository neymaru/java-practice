package com.programmers;

public class Lv0_부분문자열인지확인하기 {
    // 방법1
    public int solution(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }

    // 방법2
    public int solution2(String my_string, String target) {
        int answer = 0;
        for (int i = 0; i <= my_string.length() - target.length(); i++) {
            if (my_string.substring(i, i + target.length()).equals(target)) {
                answer = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv0_부분문자열인지확인하기 result = new Lv0_부분문자열인지확인하기();
        System.out.println(result.solution("banana", "ana"));
        System.out.println(result.solution2("banana", "wxyz"));
    }
}