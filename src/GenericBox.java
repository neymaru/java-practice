public class GenericBox<T> {    // 보통 Type의 T를 많이 쓴다.
    private T t;

    public void add(T obj) {
        this.t = obj;
    }

    public T get() {
        return this.t;
    }

//    <GenericBox>
//      - T는 제네릭과 관련된 부분이다.
//      - 제네릭은 클래스이름 뒤나, 메소드의 리턴타입 앞에 붙을 수 있다.
//      - <T>부분은 T라는 이름의 제네릭 타입을 선언한다는 것을 의미한다.
//      - T는 Type의 약자이기 때문에 많이 사용되는 문자이지 꼭 T를 쓸 필요는 없다.

//    <제네릭 장점>
//        - 정해진 타입만 사용하도록 강제할 수 있다.
//        - 타입을 강제함으로써 컴파일할 때 잘못된 타입의 값이 저장되는 것을 막을 수 있다.
}
