package by.andervyd.introduction_oop.go_next.information_about_class_and_method.access_modifiers;

public class VehicleGetSetMethod {
    public static void main(String[] args) {

        Vehicle car = new Vehicle(2, -2, 270, 12);

        System.out.println("Max speed: " + car.getMaxSpeed() + " km/h");
        System.out.println("Quantity wheels: " + car.getWheels());

        car.setWheels(4);

        System.out.println("Quantity wheels: " + car.getWheels());

        // >> Not correct sum wheels.
        //    Max speed: 270 km/h
        //    Quantity wheels: 0
        //    Quantity wheels: 4
    }
}
