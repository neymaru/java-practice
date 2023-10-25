package com.programmers;

public class Lv0_수조작하기1 {
    public int solution(int n, String control) {
        // 방법1
        for (char ch : control.toCharArray()) {
            switch (ch) {
                case 'w':
                    n += 1;
                    break;
                case 's':
                    n -= 1;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
            }
        }
        return n;
    }

    // 방법2
    public int solution2(int n, String control) {
        for (char ch : control.toCharArray()) {
            n += ch == 'w' ? 1 : ch == 's' ? -1 : ch == 'd' ?  10 : -10;
        }
        return n;
    }

    public static void main(String[] args) {
        Lv0_수조작하기1 result = new Lv0_수조작하기1();
        System.out.println(result.solution(0, "wsdawsdassw"));
        System.out.println(result.solution2(0, "wsdawsdassw"));
    }
}
