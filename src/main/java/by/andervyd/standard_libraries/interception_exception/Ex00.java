package by.andervyd.standard_libraries.interception_exception;

public class Ex00 {
    public static void main(String[] args) {

        try {
            int[] a = new int[4];
            a[5] = 5; // exception
        } catch (Throwable throwable) {
            System.out.println(throwable.getMessage());
        }
        // >> Index 5 out of bounds for length 4
    }
}
