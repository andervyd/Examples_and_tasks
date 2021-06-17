package by.andervyd.work_with_data.simple_example.division_by_zero;

public class SecureDivision {
    public static void main(String[] args) {

        int result;

        for (int divisor = -5; divisor <= 5; divisor++) {
            result = (divisor != 0) ? 100 / divisor : 0;
            if (result != 0) {
                System.out.println("100 / " + divisor + " = " + result);
            }
        }
        // >>   100 / -5 = -20
        //      100 / -4 = -25
        //      100 / -3 = -33
        //      100 / -2 = -50
        //      100 / -1 = -100
        //      100 / 1 = 100
        //      100 / 2 = 50
        //      100 / 3 = 33
        //      100 / 4 = 25
        //      100 / 5 = 20
    }
}
