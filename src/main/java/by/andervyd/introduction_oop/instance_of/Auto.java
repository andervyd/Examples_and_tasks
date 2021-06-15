package by.andervyd.introduction_oop.instance_of;

public class Auto extends Vehicle implements Movable {
    private boolean sunRoof;

    public Auto(int wheels, boolean sunRoof) {
        super(wheels);
        this.sunRoof = sunRoof;
    }

    @Override
    public void move(int left, int top) {
        System.out.println("Move: " + left + " | " + top);
    }

    public boolean isSunRoof() {
        return sunRoof;
    }

    public void setSunRoof(boolean sunRoof) {
        this.sunRoof = sunRoof;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "sunRoof=" + sunRoof +
                '}';
    }
}
