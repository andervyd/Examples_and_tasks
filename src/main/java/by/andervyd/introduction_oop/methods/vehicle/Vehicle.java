package by.andervyd.introduction_oop.methods.vehicle;

public class Vehicle {
    int passenger;
    int wheels;
    int maxSpeed;
    int burnUp;

    void distance(double interval) {
        double value = maxSpeed * interval;
        System.out.println("Path vehicle: " + value + " km.");
    }
}
