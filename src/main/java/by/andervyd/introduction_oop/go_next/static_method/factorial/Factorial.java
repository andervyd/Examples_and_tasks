package by.andervyd.introduction_oop.go_next.static_method.factorial;

public class Factorial {

    static long computeI(int i) {
        long result = 1;
        for (int j = 1; j <= i; j++) {
            result += i;
        }
        return result;
    }
}
