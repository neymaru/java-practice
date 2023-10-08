import java.util.ArrayList;
import java.util.List;

public class ListExam02 {
    public static void main(String[] args) {
        // 제네릭과 함께 ArrayList 사용하기
        
//        ArrayList<String> list = new ArrayList<>(); // 참조하는 타입도 클래스 타입, 생성하는 것도 클래스 타입
        List<String> list = new ArrayList<>();  // 앞에는 인터페이스 타입, 생성은 인터페이스를 구현하는 인스턴스 (이게 바람직)
        list.add("Kim");
        list.add("Lee");
        list.add("Hong");

        String str1 = list.get(0);
        String str2 = list.get(1);
        String str3 = list.get(2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
