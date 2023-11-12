package com.programmers;

public class Lv0_부분문자열 {
    // 방법1
    public int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }

    // 방법2
    public int solution2(String str1, String str2) {
        int answer = 0;
        for (int i = 0; i < str2.length() - str1.length() + 1; i++) {
            if (str2.substring(i, i + str1.length()).equals(str1)) {
                answer = 1;
                break;
            }
        }
        return answer;
    }

    // 방법3
    public int solution3(String str1, String str2) {
        return str2.indexOf(str1) > -1 ? 1 : 0;
    }

    public static void main(String[] args) {
        Lv0_부분문자열 result = new Lv0_부분문자열();
        System.out.println(result.solution("abc", "aabcc"));
        System.out.println(result.solution("tbt", "tbbttb"));
    }
}
