package com.programmers;

public class Lv0_공백으로구분하기1 {
    public String[] solution(String my_string) {
        return my_string.split(" ");
    }

    public static void main(String[] args) {
        Lv0_공백으로구분하기1 result = new Lv0_공백으로구분하기1();
        System.out.println(result.solution("i love you"));
        System.out.println(result.solution("programmers"));
    }
}
