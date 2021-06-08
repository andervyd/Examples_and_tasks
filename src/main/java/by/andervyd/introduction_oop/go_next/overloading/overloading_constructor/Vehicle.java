package by.andervyd.introduction_oop.go_next.overloading.overloading_constructor;

public class Vehicle {
    private int passenger;
    private int wheels;
    private int maxSpeed;
    private int burnUp;

    public Vehicle() {
        this(4, 4, 130, 30);
// or
//        passenger = 4;
//        wheels = 4;
//        maxSpeed = 130;
//        burnUp = 30;
    }

    public Vehicle(int passenger, int wheels, int maxSpeed, int burnUp) {
        this.passenger = passenger;
        this.wheels = wheels;
        this.maxSpeed = maxSpeed;
        this.burnUp = burnUp;
    }

    double distance(int interval) {
        return distance((double) interval);
    }

    double distance(double interval) {
        double value = maxSpeed * interval;
        return value;
    }
}
