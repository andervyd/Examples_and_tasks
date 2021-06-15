package by.andervyd.introduction_oop.principles_obj_prog.polymorphism;

public class PolyVehicleDemo {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(2, 2, 100, 9);
        Auto auto = new Auto(2, 4, 180, 12, true);

        Vehicle[] list = {vehicle, auto};

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].toString());
        }
        // >> Vehicle | passenger: 2, wheels: 2, max speed: 100, burn up: 9
        //    Auto | passenger: 2, wheels: 4, max speed: 180, burn up: 12, sunroof: true

    }
}
