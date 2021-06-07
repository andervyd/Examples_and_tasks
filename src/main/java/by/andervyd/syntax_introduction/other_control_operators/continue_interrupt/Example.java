package by.andervyd.syntax_introduction.other_control_operators.continue_interrupt;

public class Example {
    public static void main(String[] args) {

        for (int i = 1; i < 12; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        } // >> 1 3 5 7 9 11
    }
}
