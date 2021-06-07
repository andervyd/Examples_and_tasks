package by.andervyd.syntax_introduction.basic_constructions.control_structures.block;

public class BlockDemo {
    public static void main(String[] args) {

        double i, j, d;

        i = 50;
        j = 150;

        if (i != 0) {
            System.out.println("Divisor is not zero");
            d = j / i;
            System.out.println("j / i = " + d);
        } // >> j / i = 3.0
    }
}
