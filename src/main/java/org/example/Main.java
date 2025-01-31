package org.example;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        Car car = new Car(4, "black", 6, "electricity", "honda");

        car.honk();
        car.displayInfo();

        car.setNumberOfWheels(18);
        car.setColor("blue");
        car.setEngineSize(8);
        car.setFuelType("gas");

        car.displayInfo();

        System.out.println(car.getNumberOfWheels());
        System.out.println(car.getColor());
        System.out.println(car.getEngineSize());
        System.out.println(car.getFuelType());
    }
}