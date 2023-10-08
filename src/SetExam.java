import java.util.*;

public class SetExam {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        boolean flag1 = set.add("hello");
        boolean flag2 = set.add("hi");
        boolean flag3 = set.add("hong");
        boolean flag4 = set.add("hong");    // set은 중복 값 저장이 안된다.

        System.out.println(flag1);  // true
        System.out.println(flag2);  // true
        System.out.println(flag3);  // true
        System.out.println(flag4);  // flase

        Iterator<String> iter = set.iterator();
        while(iter.hasNext()) {
            String str = iter.next();
            System.out.println(str);
        }

    }
}
