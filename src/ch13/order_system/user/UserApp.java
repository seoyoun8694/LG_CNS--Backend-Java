package ch13.order_system.user;

import ch13.order_system.system.*;

import java.util.Scanner;

public class UserApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderSystem user = new OrderSystem();

        System.out.println("매장명: " + user.getStoreName());

        System.out.println("주문할 메뉴를 입력하세요 (CHICKEN, PIZZA, HAMBURGER, TACO, SUSHI), 'exit' 입력 시 종료:");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim().toUpperCase();

            if (input.equals("EXIT")) {
                break;
            }

            try {
                Menu menu = Menu.valueOf(input);
                user.placeOrder(menu);
            } catch (IllegalArgumentException e) {
                System.out.println("잘못된 메뉴입니다. 다시 입력하세요.");
            }
        }

        System.out.println("총 주문 수: " + user.getOrderCount());
        System.out.println("주문 내역:");
        for (Menu menu : user.getOrderHistory()) {
            System.out.println("- " + menu);
        }

        scanner.close();
    }
}