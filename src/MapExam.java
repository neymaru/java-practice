import java.util.HashMap;
import java.util.Map;

public class MapExam {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("k1", "hello");
        map.put("k2", "hi");
        map.put("k3", "안녕");
        map.put("k3", "안녕하세요"); // 존재하는 key가 있으면 value를 덮어쓴다.

        System.out.println(map.get("k1"));  // hello
        System.out.println(map.get("k2"));  // hi
        System.out.println(map.get("k3"));  // 안녕하세요


    }
}
