package com.example;

public class MyRunnableMain {
    public static void main(String[] args) {

//        람다(Lamda) 인터페이스 - 메소드를 하나만 가지고 있는 인터페이스
//        () -> {
//            System.out.println("myrunnable run!!");
//        }

        MyRunnable r = new MyRunnable() {   // 인터페이스는 인스턴스가 될 수 없기 떄문에 new를 쓰고 인터페이스명을 적으면 인텔리제이가 자동으로 이름없는 객체로 만들어줌
            @Override
            public void run() {
                System.out.println("myrunnable run!!");
            }
        };
        r.run();
    }
}
