package by.andervyd.introduction_oop.class_method_object.methods.vehicle;

public class VehicleMethodDemo {
    public static void main(String[] args) {

        Vehicle car = new Vehicle();

        car.passenger = 2;
        car.wheels = 6;
        car.maxSpeed = 130;
        car.burnUp = 30;

        double time = 1.25;

        car.distance(time);
        // >> Path vehicle: 162.5 km.
    }
}
