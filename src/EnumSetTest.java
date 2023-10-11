import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetTest {
    public static void main(String[] args) {
        EnumSet eset = EnumSet.allOf(Day.class);    // Day가 가지고 있는 상수들을 자동으로 EnumSet에 넣어줌

        Iterator<Day> dayIter = eset.iterator();

        while (dayIter.hasNext()) {
            Day day = dayIter.next();
            System.out.println(day);
        }
        System.out.println("------------------------------------");

        EnumSet eset2 = EnumSet.range(Day.MONDAY, Day.WEDNESDAY);   // range: 두 인수 사이 모든 값 포함
        Iterator<Day>  dayIter2 = eset2.iterator();
        while(dayIter2.hasNext()) {
            Day day = dayIter2.next();
            System.out.println(day);
        }

    }
}
