public class Bus2 extends Car2 {
    public Bus2() {
//        super(); // 부모의 기본생성자를 호출하는 코드가 자동으로 들어간다.
        super("네이마루"); // 부모에 기본생성자가 없을 땐, 자식에서 super()에 값을 넣어 생성자를 호출해줘야 된다..
        System.out.println("Bus2 기본생성자");
    }
}
