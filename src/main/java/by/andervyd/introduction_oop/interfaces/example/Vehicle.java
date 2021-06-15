package by.andervyd.introduction_oop.interfaces.example;

public class Vehicle {
    private int wheels;

    public Vehicle(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                '}';
    }
}
