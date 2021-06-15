package by.andervyd.introduction_oop.principles_obj_prog.abstraction;

public class ShapeDemo {
    public static void main(String[] args) {

        Point point = new Point();
        Triangle triangle = new Triangle(5, 3);
        Circle circle = new Circle(9);

        Shape[] shapes = {point, triangle, circle};

        System.out.println("Shape area: ");
        for (Shape shape : shapes) {
            System.out.println(shape.toString() + shape.area());
        }
        // >> Shape area:
        //    Point: 0.0
        //    Triangle: 7.0
        //    Circle: 254.46900494077323
    }
}
