public class GenericBoxMain {
    public static void main(String[] args) {
        GenericBox<String> genericBox = new GenericBox<>(); // 아직 정해져 있지 않은 클래스를 String 타입으로 쓰겠다 / 오른쪽 <>는 앞에 있는 String을 그대로 사용하겠다
        genericBox.add("kim");
        String str = genericBox.get();
        System.out.println(str.toUpperCase());

        GenericBox<Integer> intBox = new GenericBox<Integer>();
        intBox.add(new Integer(5)); // String만 담을 수 있는 Generic Box이기 때문에 컴파일 오류 발생
        Integer intValue = intBox.get();
        System.out.println(intValue);

        // Generic 도 Object 타입으로 쓸 수 있다.
        GenericBox<Object> objBox = new GenericBox<>();
        objBox.add("hello");
        String str2 = (String)objBox.get(); // 꺼낼 때는 형변환
        System.out.println(str2);
    }
}
