package by.andervyd.introduction_oop.principles_obj_prog.inheritance.overriding_method;

public class VehicleOverrideDemo {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(2, 2, 100, 9);
        Auto auto = new Auto(2, 4, 180, 12, true);

        System.out.println("Vehicle.toString(): \n" + vehicle.toString());
        System.out.println("Auto.toString(): \n" + auto.toString());
        // >> Vehicle.toString():
        //    Vehicle | passenger: 2, wheels: 2, max speed: 100, burn up: 9
        //    Auto.toString():
        //    Auto | passenger: 2, wheels: 4, max speed: 180, burn up: 12, sunroof: true

    }
}
