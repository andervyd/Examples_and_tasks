package by.andervyd.syntax_introduction.other_control_operators.for_each;

public class Example {
    public static void main(String[] args) {

        int[] arr = {3, 1, 4, 6, 7, 2};

        for (int result : arr) {
            System.out.print(result + " ");
        } // >> 3 1 4 6 7 2
    }
}
