package by.andervyd.syntax_introduction.other_control_operators.for_options;

public class Ex01 {
    public static void main(String[] args) {

        int x = 10;

        System.out.print("i: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            x++;
        } // >> i: 0 1 2 3 4 5 6 7 8 9

        System.out.println("\nx: " + x);
        // >> x: 20
    }
}
