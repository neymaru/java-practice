package com.programmers;

public class Lv0_모음제거 {
    // 1. 정규표현식1
    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }

    // 2. 정규표현식2
    public String solution2(String my_string) {
        return my_string.replaceAll("a|e|i|o|u", "");
    }

    // 3. string builder 사용
    public String solution3(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i += 1) {
            char c = my_string.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Lv0_모음제거 result = new Lv0_모음제거();
        System.out.println(result.solution3("bus"));
        System.out.println(result.solution3("nice to meet you"));
    }
}