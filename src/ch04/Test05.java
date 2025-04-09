package ch04;

public class Test05 {
    public static void main(String[] args) {
        int n = 5;
        int space = 0;

        for (int i = 1; i <= n; i++) {
            space = n - i;

            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
