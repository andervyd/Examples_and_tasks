package by.andervyd.syntax_introduction.operators.ternary_operator;

public class Example {
/*
    () ? true : false
*/
    public static void main(String[] args) {

        String result = (10 > 9) ? "10 > 9 is true" : "10 > 9 is false";
        System.out.println(result);
        // >> 10 > 9 is true
    }
}
