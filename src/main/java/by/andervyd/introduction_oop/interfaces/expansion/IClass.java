package by.andervyd.introduction_oop.interfaces.expansion;

public class IClass implements B {
    @Override
    public void methodB() {
        System.out.println("Method interface B");
    }

    @Override
    public void methodA() {
        System.out.println("Method interface A");
    }
}
