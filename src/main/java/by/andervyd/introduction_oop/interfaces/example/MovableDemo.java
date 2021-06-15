package by.andervyd.introduction_oop.interfaces.example;

public class MovableDemo {
    public static void main(String[] args) {

        Movable movable;

        Auto auto = new Auto(4, true);
        Moto moto = new Moto(true);

        movable = auto;
        movable.move(3, 5);
        // >> Move: 3 | 5
    }
}
