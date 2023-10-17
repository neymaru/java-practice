package com.programmers;

public class Lv0_문자열안에문자열 {
    // 1. for문 사용
    public int solution(String str1, String str2) {
        int result = 2;
        for (int i = 0; i <= str1.length() - str2.length(); i += 1) {
            if (str2.equals(str1.substring(i, i + str2.length()))) {
                result = 1;
                break;
            }
        }
        return result;
    }

    // 2. contains() 사용 // 해당 문자열에 특정 문자열이 포함되어 있는지 확인
    public int solution2(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2;
    }

    public static void main(String[] args) {
        Lv0_문자열안에문자열 result = new Lv0_문자열안에문자열();
        System.out.println(result.solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
        System.out.println(result.solution2("ppprrrogrammers", "pppp"));
    }
}