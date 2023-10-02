import java.util.Arrays;

public class Array16 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};
//        int[] array2 = {1,2,3,4,6};
//        int[] array2 = {1,2,3,4,4};

        // Arrays.compare 배열 비교 함수 (1, 0, -1 반환)
        // 값 자체가 크거나, 원소의 갯수가 많은 배열이 크다고 여김
        int compare = Arrays.compare(array1, array2);   // 왼쪽 배열이 크면 양수, 같으면 0, 오른쪽 배열이 크면 음수

        System.out.println(compare);
    }
}
