import java.util.Arrays;

public class Array17 {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 1, 2};

        // 배열 정렬 함수
        Arrays.sort(array); // 오름차순으로 정렬됨 1 2 3 4 5

        for (int i : array) {
            System.out.println(i);
        }

    }
}
