package by.andervyd.introduction_oop.go_next.nested_and_inner_class;

public class Runner {
    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        OuterClass.StaticInnerClass staticClass = new OuterClass.StaticInnerClass();
    }
}
