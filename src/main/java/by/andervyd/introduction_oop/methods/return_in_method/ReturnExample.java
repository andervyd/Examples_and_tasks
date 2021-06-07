package by.andervyd.introduction_oop.methods.return_in_method;

public class ReturnExample {

    public static void checkOnNumber(int number){
        for (int i = 0; i < 5; i++) {
            if (number == 3) {
                System.out.println("number equal 3");
                return;
            }
        }
    }

    public static void main(String[] args) {
        checkOnNumber(3);
        // >> number equal 3
    }
}
