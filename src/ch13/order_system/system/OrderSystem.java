package ch13.order_system.system;

import java.util.ArrayList;
import java.util.List;

public class OrderSystem {

    private String storeName = "Delivery Restaurant";
    private final List<Menu> orderHistory = new ArrayList<>();

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void placeOrder(Menu menu) {
        System.out.println(menu + " 주문 완료");
        orderHistory.add(menu);
    }

    public void resetOrders() {
        orderHistory.clear();
        System.out.println("주문 기록이 초기화되었습니다.");
    }

    public int getOrderCount() {
        return orderHistory.size();
    }

    public List<Menu> getOrderHistory() {
        return new ArrayList<>(orderHistory);
    }
}