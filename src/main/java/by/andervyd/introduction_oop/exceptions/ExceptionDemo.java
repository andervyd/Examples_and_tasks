package by.andervyd.introduction_oop.exceptions;

public class ExceptionDemo {

    private static double divide(double divided, double divisor)
            throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException();
        } else {
            return (divided / divisor);
        }
    }

    public static void main(String[] args) {

        double result = 0;

        try {
            result = divide(4, 2);

            System.out.println(result);
            // >> 2.0
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
