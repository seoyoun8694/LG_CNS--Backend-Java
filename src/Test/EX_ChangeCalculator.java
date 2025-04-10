package Test;

import java.util.Scanner;

public class EX_ChangeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("거스름돈 입력: ");
        int n = scanner.nextInt();
        int count = 0;

        int[] coins = {500, 100, 50, 10};

        for (int coin : coins) {
            count += n / coin;
            n %= coin;
        }

        System.out.println("필요한 동전의 최소 개수: " + count);
    }
}
