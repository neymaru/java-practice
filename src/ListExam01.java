import java.util.ArrayList;

public class ListExam01 {
    public static void main(String[] args) {
        // 제네릭을 사용하지 않고 ArrayList 사용하기

        // 자료구조 객체들은 제네릭을 사용하지 않으면 Object 타입을 저장한다.
        ArrayList list = new ArrayList();
        list.add("Kim");
        list.add("Lee");
        list.add("Hong");

        String str1 = (String) list.get(0);
        String str2 = (String) list.get(1);
        String str3 = (String) list.get(2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }

}
