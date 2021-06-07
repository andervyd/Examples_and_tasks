package by.andervyd.syntax_introduction.other_control_operators.break_label;

public class Example {
    public static void main(String[] args) {

        for (int i = 1; i < 4; i++) {
            BLOCK_MAIN: {
            if (i == 1) {
                System.out.println("i: " + i);
                break BLOCK_MAIN;
            }
                BLOCK_MIDDLE: {
                    if (i == 2) {
                        System.out.println("i: " + i);
                        break BLOCK_MIDDLE;
                    }
                    BLOCK_INNER: {
                        if (i == 3) {
                            System.out.println("i: " + i);
                            break BLOCK_INNER;
                        }
                    }
                }
            }
        }
    }
}
