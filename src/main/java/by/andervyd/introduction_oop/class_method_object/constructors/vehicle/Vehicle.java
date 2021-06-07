package by.andervyd.introduction_oop.class_method_object.constructors.vehicle;

public class Vehicle {
    int passenger;
    int wheels;
    int maxSpeed;
    int burnUp;

    public Vehicle(int p, int w, int ms, int bu) {
        passenger = p;
        wheels = w;
        maxSpeed = ms;
        burnUp = bu;
    }

    double distance(double interval) {
        double value = maxSpeed * interval;
        return value;
    }
}
