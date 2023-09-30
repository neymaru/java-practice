package com.example;

public class StringExam2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");

        if (str1.equals(str2)) {
            System.out.println("값이 같다.");
        }

        String s = str1.toUpperCase();
        System.out.println(s);  // HELLO
        System.out.println(str1);   // hello

        String substring = str1.substring(3);
        System.out.println(substring);  // l0
        System.out.println(str1);   // hello

        // String은 항상 내부적으로 새로운 문자열을 만들어서 반환
        // String이 가진 모든 메소드는 자기 자신을 변화시키지 않는다. --> 불변객체
        
    }
}
