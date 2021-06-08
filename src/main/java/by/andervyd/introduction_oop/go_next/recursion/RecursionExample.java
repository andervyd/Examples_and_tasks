package by.andervyd.introduction_oop.go_next.recursion;

public class RecursionExample {
    public static long fib(long n) {
        if ((n == 0) || (n == 1))
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        System.out.println("The 0th fibonacci number is: " + fib(0));
        System.out.println("The 7th fibonacci number is: " + fib(7));
        System.out.println("The 12th fibonacci number is: " + fib(12));
        // >> The 0th fibonacci number is: 0
        //    The 7th fibonacci number is: 13
        //    The 12th fibonacci number is: 144
    }
}