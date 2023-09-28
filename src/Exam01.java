public class Exam01 {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        System.out.println(p1.i);
        p1.printI();
        System.out.println("--------------------------");
        Child c1 = new Child();
        System.out.println(c1.i);
        c1.printI();
        System.out.println("--------------------------");
        Parent p2 = new Child(); // Child는 Parent의 자식(후손)이다.
        System.out.println(p2.i);   //필드는 타입의 것을 사용하기 때문에 Parent의 i 5가 출력된다.
        p2.printI();    // 메소드가 오버라이딩 되면 자식의 메소드가 실행된다.
        // Parent 타입으로 참조하지만 메소드는 오버라이딩 되었기 때문에 자식의 printI() 메소드가 실행되고 자식의 printI() 메소드는 자식의 i값을 출력해서 15가 출력된다.
    }
}
