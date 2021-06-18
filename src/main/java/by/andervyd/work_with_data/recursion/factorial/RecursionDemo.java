package by.andervyd.work_with_data.recursion.factorial;

public class RecursionDemo {
    public static void main(String[] args) {

        Factorial method = new Factorial();
        int factorialValue = 6;

        long valueInc = method.factorialInc(factorialValue);
        long valueRec = method.factorialRec(factorialValue);

        System.out.println("Factorial inc[" + factorialValue + "] " + valueInc);
        // >> Factorial inc[6] 720
        System.out.println("Factorial rec[" + factorialValue + "] " + valueRec);
        // >> Factorial inc[6] 720
    }
}
