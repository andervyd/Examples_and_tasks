package by.andervyd.introduction_oop.go_next.information_about_class_and_method.passing_parameters.by_value;

public class ParamByValueDemo {
    public static void main(String[] args) {

        ParamByValue value = new ParamByValue();

        int a = 2;
        int b = 3;

        value.callByValue(a, b);
        // >> x: 5, y: 4

        System.out.println("a: " + a + ", b: " + b);
        // >> a: 2, b: 3
    }
}
