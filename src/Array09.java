public class Array09 {
    public static void main(String[] args) {
        int[][] array = {{0, 1, 2}, {3, 4, 5}};

        for (int i = 0; i < array.length; i += 1) {
            for (int j = 0; j < array[i].length; j += 1) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
