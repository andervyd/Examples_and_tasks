package by.andervyd.introduction_oop.principles_obj_prog.inheritance.overriding_method;

public class Auto extends Vehicle {
    private boolean sunRoof;

    public Auto(boolean sunRoof) {
        this(4, 4, 200, 12, sunRoof);
    }

    public Auto(int passenger, int wheels, int maxSpeed, int burnUp, boolean sunRoof) {
        super(passenger, wheels, maxSpeed, burnUp);
        this.sunRoof = sunRoof;
    }

    public boolean isSunRoof() {
        return sunRoof;
    }

    public void setSunRoof(boolean sunRoof) {
        this.sunRoof = sunRoof;
    }

    @Override
    public String toString() {
        return "Auto | passenger: " + super.getPassenger()
                  + ", wheels: " + super.getWheels()
                  + ", max speed: " + super.getMaxSpeed()
                  + ", burn up: " + super.getBurnUp()
                  + ", sunroof: " + sunRoof;
    }
}
