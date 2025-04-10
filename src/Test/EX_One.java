package Test;

import java.util.Scanner;

public class EX_One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N 입력: ");
        int n = scanner.nextInt();
        System.out.print("K 입력: ");
        int k = scanner.nextInt();

        int count = 0;
        while (n > 1) {
            if (n % k != 0) {
                n -= 1;
            } else {
                n /= k;
            }
            count++;
        }

        System.out.println("최소 횟수: " + count);
    }
}