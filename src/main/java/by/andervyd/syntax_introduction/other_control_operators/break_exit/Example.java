package by.andervyd.syntax_introduction.other_control_operators.break_exit;

public class Example {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
            if (i == 2) {
                System.out.println("i == 5");
                break;
            }
        } // >> i: 0
          //    i: 1
          //    i: 2
          //    i == 5
    }
}
