package by.andervyd.standard_libraries.output.output_ru_symbol.cp866;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class HelloWorld {                         // NOT work
    public static void main(String[] args) {

        try {
            PrintStream print = new PrintStream(System.out, true, "Cp866");
            System.setOut(print);
        } catch (UnsupportedEncodingException e) {
            System.out.println("Environment doesn't support encoding");
        } finally {
            System.out.println("Вывод русских символов поддерживается");
        }
    }
}
