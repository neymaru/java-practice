package com.programmers;

import java.time.LocalDate;

public class Lv0_06_나이출력 {
    public int solution(int age) {
        LocalDate today = LocalDate.now();
        return today.getYear() - age;
    }

    public static void main(String[] args) {
        Lv0_06_나이출력 result = new Lv0_06_나이출력();
        System.out.println(result.solution(40));
        System.out.println(result.solution(23));
    }
}
