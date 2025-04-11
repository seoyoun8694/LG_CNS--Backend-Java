package ch08_escaperoom;

public class Room {
    boolean doorOpen = false;

    void openDoor() {
        if (!doorOpen) {
            doorOpen = true;
            System.out.println("문이 열렸습니다! 탈출 성공 🎉");
        } else {
            System.out.println("문은 이미 열려 있습니다.");
        }
    }
}