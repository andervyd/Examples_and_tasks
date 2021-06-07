package by.andervyd.introduction_oop.class_method_object.word_this;

public class Vehicle {
    int passenger;
    int wheels;
    int maxSpeed;
    int burnUp;

    public Vehicle(int passenger, int wheels, int maxSpeed, int burnUp) {
        this.passenger = passenger;
        this.wheels = wheels;
        this.maxSpeed = maxSpeed;
        this.burnUp = burnUp;
    }

    double distance(double interval) {
        double value = this.maxSpeed * interval;
        return value;
    }
}