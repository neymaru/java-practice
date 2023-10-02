public class Array14 {
    public static void main(String[] args) {
        int[] copyFrom = {1, 2, 3};
        int[] copyTo = java.util.Arrays.copyOf(copyFrom, copyFrom.length);  // Arrays.copyOf(): 배열 복사 함수 (인수1: 원본 배열, 인수2: 복사할 길이)
        if (copyTo == copyFrom) {
            System.out.println("copyTo == copyFrom");
        } else {
            System.out.println("copyTo != copyFrom");   // else가 실행된다. 서로 다른 배열 인스턴스를 참조하기 때문
        }

        for (int c : copyTo) {
            System.out.println(c);  // 1 2 3
        }
        System.out.println("---------------------------");
        int[] copyTo2 = java.util.Arrays.copyOf(copyFrom, 5);

        for (int c : copyTo2) {
            System.out.println(c);  // 1 2 3 0 0
        }
        System.out.println("---------------------------");
        int[] copyTo3 = copyFrom;
        for (int c : copyTo) {
            System.out.println(c); // 1 2 3
        }
    }
}
