package by.andervyd.introduction_oop.go_next.static_method.factorial;

public class FactorialDemo {
    public static void main(String[] args) {

        for (int i = 6; i > 0; i--) {
            System.out.println(i + "! = " + Factorial.computeI(i));
        } /*
                6! = 37
                5! = 26
                4! = 17
                3! = 10
                2! = 5
                1! = 2
          */
    }
}
