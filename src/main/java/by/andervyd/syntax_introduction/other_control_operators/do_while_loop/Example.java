package by.andervyd.syntax_introduction.other_control_operators.do_while_loop;

public class Example {
    public static void main(String[] args) {

        char ch = 'a';

        do {
            System.out.print(ch + " ");
            ch++;
        } while (ch <= 'g');
        // >> a b c d e f g

    }
}
