package by.andervyd.introduction_oop.principles_obj_prog.inheritance.constructor_super;

public class Auto extends Vehicle {
    private boolean sunRoof;

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
}
