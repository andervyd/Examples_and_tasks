package by.andervyd.introduction_oop.principles_obj_prog.inheritance.constructor_super;

public class Vehicle {
    private int passenger;
    private int wheels;
    private int maxSpeed;
    private int burnUp;

    public Vehicle(int passenger, int wheels, int maxSpeed, int burnUp) {
        this.passenger = passenger;
        this.wheels = wheels;
        this.maxSpeed = maxSpeed;
        this.burnUp = burnUp;
    }

    void distance(double interval) {
        double value = maxSpeed * interval;
        System.out.println("Path vehicle: " + value + " km.");
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getBurnUp() {
        return burnUp;
    }

    public void setBurnUp(int burnUp) {
        this.burnUp = burnUp;
    }
}
