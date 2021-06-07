package by.andervyd.introduction_oop.class_method_object.class_definition.vehicle;

public class VehiclesDemo {
    public static void main(String[] args) {

        Vehicle car;
        car = new Vehicle();

        car.passenger = 2;
        car.wheels = 6;
        car.maxSpeed = 130;
        car.burnUp = 30;

        Vehicle bus = new Vehicle();

        bus.passenger = 45;
        bus.wheels = 4;
        bus.maxSpeed = 100;
        bus.burnUp = 45;

        double interval = 1.25;
        double distanceCar = car.maxSpeed * interval;
        double distanceBus = bus.maxSpeed * interval;

        System.out.println("In an hour twenty five a car can pass " + distanceCar + " km.");
        // >> In an hour twenty five a bus can pass 162.5 km.

        System.out.println("In an hour twenty five a bus can pass " + distanceBus + " km.");
        // >> In an hour twenty five a bus can pass 125.0 km.

    }
}
