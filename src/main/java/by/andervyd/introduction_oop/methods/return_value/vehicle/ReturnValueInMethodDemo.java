package by.andervyd.introduction_oop.methods.return_value.vehicle;

public class ReturnValueInMethodDemo {
    public static void main(String[] args) {

        Vehicle car = new Vehicle();

        car.passenger = 2;
        car.wheels = 6;
        car.maxSpeed = 130;
        car.burnUp = 30;

        double time = 1.25;
        double distanceCar = car.distance(time);

        System.out.println("Path vehicle: " + distanceCar + " km.");
        // >> Path vehicle: 162.5 km.
    }

}
