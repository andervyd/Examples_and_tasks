package by.andervyd.introduction_oop.exceptions;

public class DivisionByZeroException extends Exception {

    @Override
    public String getMessage() {
        return "Division by zero not correct.";
    }
}
