package com.example;

public class CarExam {
    public static void main(String[] args) {
//        Car c1 = new Car(); // Car 는 추상클래스이기 때문에 에러(추상클래스는 인스턴스가 될 수 없음)
        Car c2 = new Bus(); // Car 클래스를 상속받는 클래스는 가능
       Car c1 = new Car(){  // 생성자 뒤에 중괄호를 쓰고 코드를 오버라이딩 하여 보통 구현하면 이름없는 클래스(Anonymous Class)
           @Override
           public void a() {
               System.out.println("이름없는 객체의 a()메소드 오버라이딩");
           }
       };
        c1.a();

    }
}