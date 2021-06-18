package by.andervyd.work_with_data.recursion.factorial;

public class Factorial {

    long factorialInc(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    long factorialRec(int n) {
        if (n == 1) {
            return n;
        }
        return factorialRec(n - 1) * n;
    }
}
