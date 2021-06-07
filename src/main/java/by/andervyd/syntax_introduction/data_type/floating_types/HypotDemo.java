package by.andervyd.syntax_introduction.data_type.floating_types;

public class HypotDemo {
    public static void main(String[] args) {

        double cathetusOneSide = 3;
        double cathetusTwoSide = 4;

        double hypot = Math.sqrt((cathetusOneSide + cathetusOneSide) *
                                 (cathetusTwoSide * cathetusTwoSide));

        System.out.printf("Hypot: %.2f %s", hypot, "cm");
        // >> Hypot: 9.80 cm
    }
}
