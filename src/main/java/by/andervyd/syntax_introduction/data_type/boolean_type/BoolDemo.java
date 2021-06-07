package by.andervyd.syntax_introduction.data_type.boolean_type;

public class BoolDemo {
    public static void main(String[] args) {

        boolean b = false;
        System.out.println("b: " + b);
        // >> false

        b = true;
        System.out.println("b: " + b);
        // >> true

        if (b) {
            System.out.println("Will you look this text?");
        } // >> Will you look this text?

        System.out.println("10 > 9 is " + (10 > 9));
        // >> 10 > 9 is true
    }
}
