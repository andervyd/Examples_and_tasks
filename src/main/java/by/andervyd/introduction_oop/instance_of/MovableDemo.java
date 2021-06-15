package by.andervyd.introduction_oop.instance_of;

public class MovableDemo {
    public static void main(String[] args) {

        Auto auto = new Auto(4, true);
        Moto moto = new Moto(true);

        Movable[] movables = {auto, moto};

        for (Movable movable : movables) {
            if (movable instanceof Vehicle) {
                System.out.println(movable.toString());
            }
        }
        // >> Auto{sunRoof=true} // ONLY Auto
    }
}
