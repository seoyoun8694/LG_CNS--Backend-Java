package ch13.order_system.admin;

import ch13.order_system.system.*;

public class AdminApp extends OrderSystem {
    public static void main(String[] args) {
        AdminApp admin = new AdminApp();

        System.out.println("매장명: " + admin.getStoreName());

        admin.placeOrder(Menu.PIZZA);
        admin.placeOrder(Menu.HAMBURGER);

        System.out.println("총 주문 수: " + admin.getOrderCount());

        System.out.println("주문 내역:");
        for (Menu m : admin.getOrderHistory()) {
            System.out.println("- " + m);
        }

        admin.resetOrders();
        System.out.println("현재 주문 수: " + admin.getOrderCount());
    }
}