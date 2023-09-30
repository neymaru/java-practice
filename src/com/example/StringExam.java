package com.example;

public class StringExam {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";  // str1 과 같은 hello 를 참조
        String str3 = new String("hello");  // new 가 쓰이면 heap 메모리에 새로운 객체가 만들어짐
        String str4 = new String("hello");  // new 가 쓰이면 heap 메모리에 새로운 객체가 만들어짐

//        == 는 '같은 것을 참조 하느냐?' (값이 값냐가 아님)
//        str1 == str2 // true (같은 것을 참조)
//        str2 == str3 // false (다른 것을 참조)
//        str3 == str4 // false (다른 것을 참조)

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
