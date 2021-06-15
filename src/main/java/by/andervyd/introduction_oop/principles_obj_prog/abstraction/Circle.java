package by.andervyd.introduction_oop.principles_obj_prog.abstraction;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return ((radius * radius) * Math.PI);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle: ";
    }
}
