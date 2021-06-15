package by.andervyd.introduction_oop.principles_obj_prog.abstraction;

public class Triangle extends Shape {
    private int cathetusOne;
    private int cathetusTwo;

    public Triangle(int cathetusOne, int cathetusTwo) {
        this.cathetusOne = cathetusOne;
        this.cathetusTwo = cathetusTwo;
    }

    @Override
    double area() {
        return ((cathetusOne * cathetusTwo) / 2);
    }

    public int getCathetusOne() {
        return cathetusOne;
    }

    public void setCathetusOne(int cathetusOne) {
        this.cathetusOne = cathetusOne;
    }

    public int getCathetusTwo() {
        return cathetusTwo;
    }

    public void setCathetusTwo(int cathetusTwo) {
        this.cathetusTwo = cathetusTwo;
    }

    @Override
    public String toString() {
        return "Triangle: ";
    }
}
