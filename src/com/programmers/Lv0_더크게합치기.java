package com.programmers;

class Lv0_더크게합치기 {
    public int solution(int a, int b) {
        int ab = Integer.parseInt("" + a + b);
        int ba = Integer.parseInt("" + b + a);
        return ab > ba ? ab : ba;
    }

    public static void main(String[] args) {
        Lv0_더크게합치기 result = new Lv0_더크게합치기();
        System.out.println(result.solution(9, 91));
        System.out.println(result.solution(89, 8));
    }
}



