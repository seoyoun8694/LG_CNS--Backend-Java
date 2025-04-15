package ch12.smart_system;

public class Main {
    public static void main(String[] args) {
        SmartDevice[] devices = {
                new WashingMachine(),
                new AirConditioner()
        };

        for (SmartDevice d : devices) {
            d.turnOn();
            d.operate();

            if (d instanceof Updatable) {
                ((Updatable) d).updateSoftware();
            }

            d.turnOff();
            System.out.println();
        }
    }
}