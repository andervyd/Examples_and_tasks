package by.andervyd.standard_libraries.interception_exception;

public class Ex01 {
    public static void main(String[] args) {

        try {
            int[] a = new int[4];
            a[5] = 5; // exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }
        // >>   Exception: Index 5 out of bounds for length 4
        //      java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
        //	        at by.andervyd.standard_libraries.interception_exception.Ex01.main(Ex01.java:8)
    }
}
