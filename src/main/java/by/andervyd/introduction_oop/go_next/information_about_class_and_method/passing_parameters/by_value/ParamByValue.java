package by.andervyd.introduction_oop.go_next.information_about_class_and_method.passing_parameters.by_value;

public class ParamByValue {

    void callByValue(int x, int y) {
        x = x + y; // x+= y
        y = y + 1; // y++
        System.out.println("x: " + x + ", y: " + y);
    }
}
