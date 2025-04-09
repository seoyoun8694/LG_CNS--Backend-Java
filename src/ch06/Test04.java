package ch06;

public class Test04 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int num = 1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = num++;
            }
        }

        int first = 0;
        int last = 4;
        int cv = 1;

        for (int row = 0; row < 5; row++) {
            for (int col = first; col != last + cv; col += cv) {
                System.out.printf("%3d", matrix[row][col]);
            }
            int temp = first;
            first = last;
            last = temp;
            cv *= -1;

            System.out.println();
        }
    }
}