package by.andervyd.standard_libraries.output.output_ru_symbol.class_cp866;

import java.io.UnsupportedEncodingException;

public class HelloWorld {
    public static void main(String[] args) {

        try {                                     // NOT work
            System.setOut(new RusPrintStream());
        } catch (UnsupportedEncodingException e) {
            System.out.println("Environment doesn't support encoding");
        } finally {
            System.out.println("Привет Мир!");
        }
    }
}
