package com.example.main;

import com.example.util.Calculator;
//import com.example.util2.Calculator; // 이렇게 할 경우 Calculator 라는 같은 클래스의 이름을 쓰면 JVM이 어떤 건 지 알 수 없다.

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int value = cal.plus(10,100);
        System.out.println(value);

        // 그래서 같은 이름의 클래스를 사용할 때, 하나는 import, 다른 하나는 클래스명 앞에 패키지명까지 붙여 사용한다.
        com.example.util2.Calculator cal2 = new com.example.util2.Calculator();
        int value2 = cal2.divide(100, 50);
        System.out.println(value2);
    }
}
