package com.programmers;

public class Lv0_개미군단 {
    public int solution(int hp) {
        return (hp / 5) + (hp % 5 / 3) + (hp % 5 % 3 / 1);
    }

    public static void main(String[] args) {
        Lv0_개미군단 result = new Lv0_개미군단();
        System.out.println(result.solution(23));
        System.out.println(result.solution(24));
        System.out.println(result.solution(999));
    }
}
