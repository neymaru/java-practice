public class Person {
    String name;    // 인스턴스 필드 (static 없음)
    String address;
    boolean isVip;
    static int count;   // 클래스 필드 (클래스 변수)
    static { // 클래스 필드는 static 블록에서 초기화 할 수 있다.
        count = 100;
    }

    //인스턴스 메소드: 인스턴스를 생성해야 사용 가능
    public void printName() {
        System.out.println("내 이름은 " + name);
    }

    // 클래스 메소드: 인스턴스를 생성하지 않아도 클래스명.메소드명() 과 같은 형식으로 사용 가능
    public static void printCount() {
//        System.out.println(name);   // static 한 메소드는 인스턴스 필드나 인스턴스 메소드를 사용할 수 없다. -> 메모리에 생성되는 시점이 다르기 때문
        System.out.println("count : " + count);
    }
}
