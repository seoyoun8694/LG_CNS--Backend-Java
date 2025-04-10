package Test;

import java.util.Scanner;

public class EX_MaximizeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();

        int result = S.charAt(0) - '0';

        for (int i = 1; i < S.length(); i++) {
            int num = S.charAt(i) - '0';

            if (result <= 1 || num <= 1) {
                result += num;
            } else {
                result *= num;
            }
        }

        System.out.println(result);
    }
}