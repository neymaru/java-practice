import java.util.Arrays;

public class Array15 {
    public static void main(String[] args) {
        char[] copyFrom = {'h', 'e', 'l', 'l', 'o', '!'};

        char[] copyTo = Arrays.copyOfRange(copyFrom, 1, 3);   // copyFrom 배열을 index 1번째 부터 3번째 직전 까지 복사

        for (char c : copyTo) {
            System.out.println(c);  // e l
        }
    }
}
