public class PersonTest2 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "손흥민";
        p2.name= "케인";

        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p1.count);
        System.out.println(p2.count);
        p1.count++;
        System.out.println(p1.count);
        System.out.println(p2.count);
        p2.count++;
        System.out.println(p1.count);
        System.out.println(p2.count);
        // p1.count와 p2.count 는 같이 증가
        // 인스턴스를 만들지 않아도 Person을 JVM이 읽어들일 때 count 변수는 메모리에 따로 올라간다
        // Person.count 라고 쓰는 것이 바람직하다.
    }
}
