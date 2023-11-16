package com.programmers;

public class Lv0_특정한문자를대문자로바꾸기 {
    public String solution(String my_string, String alp) {
        return my_string.replace(alp, alp.toUpperCase());
    }

    public static void main(String[] args) {
        Lv0_특정한문자를대문자로바꾸기 result = new Lv0_특정한문자를대문자로바꾸기();
        System.out.println(result.solution("programmers", "p"));
        System.out.println(result.solution("lowercase", "x"));
    }
}