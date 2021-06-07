package by.andervyd.introduction_oop.class_method_object.class_definition.vehicle;

public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle car = new Vehicle();

        car.passenger = 2;
        car.wheels = 6;
        car.maxSpeed = 130;
        car.burnUp = 30;

        double distance = car.maxSpeed * 0.5;
        System.out.println("In half an hour, the car can drive " + distance + " km.");
        // >> In half an hour, the car can drive 65.0 km.
    }
}
