package com.programmers.lv0;

import java.time.LocalDate;

public class 나이출력 {
    public int solution(int age) {
        LocalDate today = LocalDate.now();
        return today.getYear() - age;
    }

    public static void main(String[] args) {
        나이출력 result = new 나이출력();
        System.out.println(result.solution(40));
        System.out.println(result.solution(23));
    }
}
