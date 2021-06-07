package by.andervyd.introduction_oop.class_method_object.methods.return_value.vehicle;

public class Vehicle {
    int passenger;
    int wheels;
    int maxSpeed;
    int burnUp;

    double distance(double interval) {
        double value = maxSpeed * interval;
        return value;
    }
}
