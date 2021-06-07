package by.andervyd.syntax_introduction.other_control_operators.if_options;

public class IfElseIFExample {
    public static void main(String[] args) {

        int a = 10;

        if (a > 6) {
            if (a == 6) {
                System.out.println("a == 6 is true");
            }
            System.out.println("a > 6 is true");
        } else if (a < 6) {
            System.out.println("a > b is false");
        } // >> a > 6 is true

    }
}
