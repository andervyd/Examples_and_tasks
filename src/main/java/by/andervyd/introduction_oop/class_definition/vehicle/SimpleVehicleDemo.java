package by.andervyd.introduction_oop.class_definition.vehicle;

public class SimpleVehicleDemo {
    public static void main(String[] args) {

        Vehicle car, bus;
        car = new Vehicle();

        car.passenger = 25;
        bus = car;

        System.out.println("Car passenger: " + car.passenger);
        System.out.println("Bus passenger: " + bus.passenger);
        // >> Car passenger: 25
        //    Bus passenger: 25
    }
}
