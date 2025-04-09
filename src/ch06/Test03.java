package ch06;

public class Test03 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int num = 1;

        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                matrix[row][col] = num++;
            }
        }

        for (int col = 0; col < 5; col++) {
            for (int row = 0; row < 5; row++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
