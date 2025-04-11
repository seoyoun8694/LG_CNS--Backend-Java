package ch08_escaperoom;

public class Player {
    String name;
    boolean hasKey = false;
    boolean hasFakeKey = false;

    Player(String name) {
        this.name = name;
    }

    void pickUpKey(boolean isReal) {
        if (isReal) {
            hasKey = true;
            System.out.println("[" + name + "] 진짜 열쇠를 주웠습니다.");
        } else {
            hasFakeKey = true;
            System.out.println("[" + name + "] 가짜 열쇠를 주웠습니다.");
        }
    }

    void tryToOpenDoor(Room room) {
        if (hasKey) {
            room.openDoor();
        } else if (hasFakeKey) {
            System.out.println("가짜 열쇠로는 문이 열리지 않네요.");
        } else {
            System.out.println("열쇠가 없습니다.");
        }
    }
}