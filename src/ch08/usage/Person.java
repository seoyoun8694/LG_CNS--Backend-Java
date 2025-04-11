package ch08.usage;

import ch08.aggregation.Car;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void driveCar() {
        Car car = new Car();
        car.start();
        car.drive();
        car.stop();
    }
}