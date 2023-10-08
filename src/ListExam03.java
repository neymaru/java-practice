import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListExam03 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();  // 생성하는 부분엔 Collection을 구현하고 있는 자료구조가 올 수 있다.
        // 앞에도 클래스 타입, 생성도 클래스 타입 형태로 하기보다
        // 앞에는 인터페이스 타입, 생성은 클래스 타입으로 하는 훈련을 해야한다.

        collection.add("Kim");
        collection.add("Lee");
        collection.add("Hong");

        System.out.println(collection.size());

//        collection.get(0);  // Collection 인터페이스는 get() 메소드를 가지고 있지 않아서 사용 불가
//        iterator() 메소드를 사용해야 한다.
        Iterator<String> iter = collection.iterator();  // Iterator는 Collection에 있는 모든 자료를 꺼내기 위한 인터페이스 타입
        // collection이 String이까 Iterator로 꺼낼 때도 제네릭을 String 타입으로
        while (iter.hasNext()) {    // hasNext() 메소드는 꺼낼 것이 있는지 확인
            String str = iter.next();   // next()는 하나를 꺼내는 메소드
            System.out.println(str);
        }

    }
}
