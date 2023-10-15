package com.programmers;

public class Lv0_문자반복출력하기 {
    // 1. 2중 for문 사용
//    public String solution(String my_string, int n) {
//        String answer = "";
//        for (int i = 0; i < my_string.length(); i += 1) {
//            for (int j = 0; j < n; j += 1) {
//                answer += my_string.charAt(i);
//            }
//        }
//        return answer;
//    }

    // 2. toCharArray(), repeat() 사용
//    public String solution(String my_string, int n) {
//        String answer = "";
//        for (char c : my_string.toCharArray()) {
//            answer += (c + "").repeat(n);
//        }
//        return answer;
//    }

    // 3. StringBuilder 사용
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            sb.append((c + "").repeat(n));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Lv0_문자반복출력하기 result = new Lv0_문자반복출력하기();
        System.out.println(result.solution("hello", 3));
    }
}