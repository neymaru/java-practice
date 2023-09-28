public class CarExam01 {
    public static void main(String[] args) {
        Bus b1 = new Bus();
        b1.drive();
        b1.안내방송();

        Car c1 = new Bus(); // 버스는 자동차다.
        c1.drive();
//        c1.안내방송();    // 사용 불가

        // 위와같이 Bus 인스턴스를 Car 타입으로 참조해서 Car 타입의 메소드만 사용하고 있었는데 Bus가 가지고 있는 추가적인 메소드를 사용하려면?
        Bus b2 = (Bus)c1;   // c1이 참조하는 Bus 인스턴스를 원래의 Bus형태로 참조해서 사용하겠다고 선언
        b2.안내방송();

        Car c2 = new SuperCar();
        c2.drive();
    }
}