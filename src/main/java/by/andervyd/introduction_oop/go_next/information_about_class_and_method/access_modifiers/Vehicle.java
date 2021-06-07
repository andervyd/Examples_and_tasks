package by.andervyd.introduction_oop.go_next.information_about_class_and_method.access_modifiers;

public class Vehicle {
    int passengers;
    private int wheels;
    private int maxSpeed;
    int burnUp;

    public Vehicle(int passengers, int wheels, int maxSpeed, int burnUp) {
        this.passengers = passengers;
        this.setWheels(wheels);
        this.maxSpeed = maxSpeed;
        this.burnUp = burnUp;
    }

    double distance(double interval) {
        double value = maxSpeed * interval;
        return value;
    }

    public int getWheels() {
        return wheels;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setWheels(int wheels) {
        if (wheels < 1 || wheels > 24) {
            System.out.println("Not correct sum wheels.");
            return;
        }
        this.wheels = wheels;
    }
}