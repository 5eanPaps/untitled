package org.example;

public class Car extends Vehicle {
    String brand;

    public Car(int n, String c, float e, String f, String b) {
        numberOfWheels = n;
        color = c;
        engineSize = e;
        fuelType = f;
        brand = b;
    }

    public void honk() {
        System.out.println("Honk, honk!");
    }

    public void displayInfo() {
        System.out.println("My car has " + numberOfWheels + " wheels, and it is a " + color + " " + brand + " that has a " + engineSize + " cylinder engine that runs on " + fuelType + ".");
    }
}
