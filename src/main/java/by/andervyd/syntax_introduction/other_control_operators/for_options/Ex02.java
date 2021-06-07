package by.andervyd.syntax_introduction.other_control_operators.for_options;

public class Ex02 {
    public static void main(String[] args) {

        for (int x = 5, y = 1; x > 0; x--, y++) {
            System.out.print("x: " + x + ", y: " + y + "\n");
        } // >> x: 5, y: 1
          //    x: 4, y: 2
          //    x: 3, y: 3
          //    x: 2, y: 4
          //    x: 1, y: 5
    }
}
