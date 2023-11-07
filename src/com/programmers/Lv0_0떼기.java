package com.programmers;

public class Lv0_0떼기 {
    // 방법1
    public String solution(String n_str) {
        int i = 0;
        while (true) {
            if (n_str.charAt(i) != '0') {
                break;
            }
            i++;
        }
        return n_str.substring(i);
    }

    // 방법2
    public String solution2(String n_str) {
        return Integer.parseInt(n_str) + "";
    }

    public static void main(String[] args) {
        Lv0_0떼기 result = new Lv0_0떼기();
        System.out.println(result.solution("0010"));
        System.out.println(result.solution2("854020"));
    }
}