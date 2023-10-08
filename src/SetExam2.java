import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class SetExam2 {
    public static void main(String[] args) {
        Set<MyData> mySet = new HashSet<>();
        mySet.add(new MyData("Kim", 500));
        mySet.add(new MyData("Lee", 200));
        mySet.add(new MyData("Hong", 700));
        mySet.add(new MyData("Hong", 700));

        Iterator<MyData> iterator = mySet.iterator();
        while(iterator.hasNext()) {
            MyData myData = iterator.next();
            System.out.println(myData);

        }
    }
}

class MyData {
    private String name;
    private int value;

    public MyData(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    // Hash 알고리즘이 나오면 Object가 가지고 있는 메소드 중에서 hashCode()와 equals() 두 가지를 오버라이딩 해줘야 된다.
    @Override
    public boolean equals(Object o) {
        System.out.println("equals!!");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData myData = (MyData) o;
        return value == myData.value && Objects.equals(name, myData.name);
    }

    @Override
    public int hashCode() {
        System.out.println("Hashcode!!");
        return Objects.hash(name, value);
    }

    @Override
    public String toString() {
        return "MyData{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}

