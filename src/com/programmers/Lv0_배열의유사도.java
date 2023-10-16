package com.programmers;

public class Lv0_배열의유사도 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String v1 : s1) {
            for (String v2 : s2) {
                answer += v1.equals(v2) ? 1 : 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv0_배열의유사도 result = new Lv0_배열의유사도();
        System.out.println(result.solution(new String[] {"a", "b", "c"}, new String[] {"com", "b", "d", "p", "c"}));
    }
}