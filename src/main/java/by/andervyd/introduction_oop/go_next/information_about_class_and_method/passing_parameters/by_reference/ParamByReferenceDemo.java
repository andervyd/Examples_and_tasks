package by.andervyd.introduction_oop.go_next.information_about_class_and_method.passing_parameters.by_reference;

public class ParamByReferenceDemo {
    public static void main(String[] args) {

        ParamByReference a = new ParamByReference(2, 3);
        ParamByReference b = new ParamByReference(3, 2);

        System.out.println("b.x: " + b.x + ", b.y: " +b.y);
        // >> b.x: 3, b.y: 2

        a.callByRef(b);

        System.out.println("b.x: " + b.x + ", b.y: " +b.y);
        // >> b.x: 5, b.y: 5
    }
}
