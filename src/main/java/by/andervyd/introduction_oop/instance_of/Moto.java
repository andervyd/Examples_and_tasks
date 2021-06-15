package by.andervyd.introduction_oop.instance_of;

public class Moto implements Movable {
    private boolean radio;

    public Moto(boolean radio) {
        this.radio = radio;
    }

    @Override
    public void move(int left, int top) {
        System.out.println("Move: " + left + " | " + top);
    }
}
