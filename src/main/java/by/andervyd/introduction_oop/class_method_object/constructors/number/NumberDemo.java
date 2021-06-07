package by.andervyd.introduction_oop.class_method_object.constructors.number;

public class NumberDemo {
    public static void main(String[] args) {

        Number numOne = new Number(10);
        Number numTwo = new Number(20);

        System.out.println(numOne.x + " *** " + numTwo.x);
        // >> 10 *** 20
    }
}
