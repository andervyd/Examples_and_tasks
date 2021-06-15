package by.andervyd.introduction_oop.principles_obj_prog.abstraction;

public class Point extends Shape {

    @Override
    double area() {
        return 0;
    }

    @Override
    public String toString() {
        return "Point: ";
    }
}
