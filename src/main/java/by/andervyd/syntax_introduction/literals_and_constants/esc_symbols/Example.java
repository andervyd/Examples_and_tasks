package by.andervyd.syntax_introduction.literals_and_constants.esc_symbols;

/*
Special characters         Display
\'                         Single quotation mark
\"                         Double quotation mark
\\                         Backslash
\t                         Tab
\b                         Backspace
\r                         Carriage return
\f                         Formfeed
\n                         Newline
*/

public class Example {
    public static void main(String[] args) {

        char ch;

        ch = '\t';
        ch = '\'';

        System.out.println("O" + ch + "Key");
        // >> O'Key
    }
}
