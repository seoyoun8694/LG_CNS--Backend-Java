package ch08_escaperoom;

public class Item {
    String name;
    boolean hasRealKey = false;
    boolean hasFakeKey = false;
    boolean checked = false;

    Item(String name) {
        this.name = name;
    }

    void check(Player player) {
        if (checked) {
            System.out.println(name + "은(는) 이미 조사했습니다.");
            return;
        }

        System.out.println(name + "을(를) 조사 중...");
        checked = true;

        if (hasRealKey) {
            System.out.println("진짜 열쇠를 발견했습니다!");
            player.pickUpKey(true);
        } else if (hasFakeKey) {
            System.out.println("가짜 열쇠입니다... 진짜 열쇠가 아닌 것 같아요.");
            player.pickUpKey(false);
        } else {
            System.out.println("아무것도 없네요.");
        }
    }
}