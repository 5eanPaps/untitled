package org.example;

public class Vehicle {
    int numberOfWheels;
    String color;
    float engineSize;
    String fuelType;

    public Vehicle() {
        numberOfWheels = 4;
        color = "red";
        engineSize = 4;
        fuelType = "electricity";
    }

    public Vehicle(int n, String c, float e, String f) {
        numberOfWheels = n;
        color = c;
        engineSize = e;
        fuelType = f;
    }

    public int getNumberOfWheels () { return numberOfWheels; }
    public void setNumberOfWheels(int n) { numberOfWheels = n; }

    public String getColor() { return color; }
    public void setColor(String c) { color = c; }

    public float getEngineSize() { return engineSize; }
    public void setEngineSize(float e) { engineSize = e; }

    public String getFuelType() { return fuelType; }
    public void setFuelType(String f) { fuelType = f; }
}
