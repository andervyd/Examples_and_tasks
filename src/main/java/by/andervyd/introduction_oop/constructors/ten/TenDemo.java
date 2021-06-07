package by.andervyd.introduction_oop.constructors.ten;

public class TenDemo {
    public static void main(String[] args) {

        Ten tenOne = new Ten();
        Ten tenTwo = new Ten();

        if (tenOne.x == tenTwo.x) {
            System.out.println(tenOne.x + " = " + tenTwo.x);
        } // >> 10 = 10
    }
}
