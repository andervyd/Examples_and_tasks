package by.andervyd.syntax_introduction.operators.arithmetic_operators;

public class DivisionDemo {
    public static void main(String[] args) {

        int iResult = 10 / 3;
        int iRemain = 10 % 3;

        System.out.println("10 / 3 = " + iResult);
        System.out.println("10 % 3 = " + iRemain);
        // >> 10 / 3 = 3
        //    10 % 3 = 1

        double dResult = 10 / 3;
        double dRemain = 10 % 3;

        System.out.println("10 / 3 = " + dResult);
        System.out.println("10 % 3 = " + dRemain);
        // >> 10 / 3 = 3.0
        //    10 % 3 = 1.0
    }
}
