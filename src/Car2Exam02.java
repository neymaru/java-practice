public class Car2Exam02 {
    public static void main(String[] args) {
//        Car2 c = new Car2("neymaru");   // 추상 클래스는 인스턴스가 될 수 없다.
        Bus2 b = new Bus2();
        b.run();

        SportsCar s1 = new SportsCar("sports car!!");
        s1.run();

//        Car2 c = new Car2(); // Car2 는 추상클래스 이기 때문에 이 코드는 불가. 인스턴스 생성 자리에 자식(자손)만 가능
    }
}
