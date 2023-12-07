package com.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv0_공백으로구분하기2 {
    public String[] solution(String my_string) {
        return my_string.trim().split("\\s+");
    }

    public static void main(String[] args) {
        Lv0_공백으로구분하기2 result = new Lv0_공백으로구분하기2();
        System.out.println(result.solution(" i    love  you"));
        System.out.println(result.solution("    programmers  "));
    }
}
