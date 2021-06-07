package by.andervyd.introduction_oop.class_method_object.constructors.vehicle;

public class VehicleConstDemo {
    public static void main(String[] args) {

        Vehicle car = new Vehicle(2, 4, 130, 30);
        Vehicle bus = new Vehicle(45, 4, 120, 25);

        double interval = 1;
        double distanceCar = car.distance(interval);
        double distanceBus = bus.distance(interval);

        System.out.println("In an hour a car can pass " + distanceCar + " km.");
        // >> In an hour a car can pass 130.0 km.

        System.out.println("In an hour a bus can pass " + distanceBus + " km.");
        // >> In an hour a bus can pass 120.0 km.
    }
}
