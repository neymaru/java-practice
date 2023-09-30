public abstract class Car2 {
    public Car2(String name) {  // 다른 형태의 생성자를 만들어주면 기본생성자는 만들어지지 않는다.
        super(); // 자동으로 들어간다.
        System.out.println("Car2() 생성자 호출 ");
    }

    // 추상메소드. Car2를 만든사람은 run()이라는 메소드가 필요하다고 생각을 하였다.
    // run()은 자동차마다 다르게 구현할 것 같아.
    public abstract void run(); // 구현부분 없이 메소드 선언만 하기
}
