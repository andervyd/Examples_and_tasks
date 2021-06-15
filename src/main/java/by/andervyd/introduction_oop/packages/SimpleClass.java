package by.andervyd.introduction_oop.packages;

public class SimpleClass {
    private String text;

    public SimpleClass(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "SimpleClass: text - " + text;
    }
}
