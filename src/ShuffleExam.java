import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("lee");
        list.add("hong");

        Collections.shuffle(list);  // // shuffle(): Collections 클래스의 셔플(섞기) 메소드

        for(int i = 0; i < list.size(); i += 1) {
            System.out.println(list.get(i));
        }
    }
}
