package Test;

public class CH04_star1 {
    public static void main(String[] args) {
        int n = 5;

        printLeftTriangle(n);
        System.out.println("-----");
        printRightTriangle(n);
    }

    public static void printLeftTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n - i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
