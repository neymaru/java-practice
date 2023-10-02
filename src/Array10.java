public class Array10 {
    public static void main(String[] args) {
        int[][] array = new int[2][];   // 아직 1번째 배열 길이는 정해지지 않음
        array[0] = new int[2];
        array[1] = new int[3];  // 가변

        array[0][0] = 0;
        array[0][1] = 1;
        array[1][0] = 2;
        array[1][1] = 3;
        array[1][2] = 4;

        for(int i = 0; i < array.length; i += 1) {
            for(int j = 0; j < array[i].length; j += 1) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
