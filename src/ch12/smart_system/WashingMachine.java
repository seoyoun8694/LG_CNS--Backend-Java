package ch12.smart_system;

public class WashingMachine extends SmartDevice implements Updatable {
    @Override
    public void operate() {
        if (power) {
            System.out.println("세탁기가 동작 중입니다.");
        } else {
            System.out.println("세탁기 전원이 꺼져 있어 동작할 수 없습니다.");
        }
    }

    @Override
    public void updateSoftware() {
        System.out.println("세탁기 소프트웨어를 업데이트 중입니다.");
    }
}