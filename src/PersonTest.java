public class PersonTest {
    public static void main(String[] args) {
//        Person p1; // p1은 null (참조형)
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "손흥민";    // 문자열은  new를 사용하지 않고 인스턴스를 사용할 수 있다. 되도록 new를 사용하지 말자(String 사용 시)
//        p1.address = "서울";
        p1.isVip = true;
        p2.name = "케인";
        p2.address = "경기";

        System.out.println(p1.name);    // null (String 타입은 참조형 이므로 null)
        System.out.println(p1.name.length());   // 3
        System.out.println(p1.address); // null
        System.out.println(p1.address.length()); // NullPointException Error
        System.out.println(p1.isVip);
        System.out.println("----------------------------");
        System.out.println(p2.name);
        System.out.println(p2.name.length());   // 2
        System.out.println(p2.address);
        System.out.println(p2.isVip);

    }
}
