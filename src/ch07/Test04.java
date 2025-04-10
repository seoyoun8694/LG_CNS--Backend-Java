package ch07;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("자백 여부 입력(T/F)");
        System.out.printf("A: ");
        boolean a = sc.next().equalsIgnoreCase("T");
        System.out.printf("B: ");
        boolean b = sc.next().equalsIgnoreCase("T");

        System.out.println(judge(a, b));
        sc.close();
    }

    public static String judge(boolean a, boolean b) {
        if (a && b) return ">> A, B 둘다 5년 복역";
        if (a) return ">> A 10년 복역, B 석방";
        if (b) return ">> A 석방, B 10년 복역";
        return ">> A, B 둘다 1년 복역";
    }
}