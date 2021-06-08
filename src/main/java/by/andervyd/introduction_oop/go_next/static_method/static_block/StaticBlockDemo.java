package by.andervyd.introduction_oop.go_next.static_method.static_block;

public class StaticBlockDemo {
    public static void main(String[] args) {

        System.out.println("Root of 9: " + StaticBlock.rootOf9);
        System.out.println("Root of 27: " + StaticBlock.rootOf27);
        // >> Initialisation static ...
        //    Root of 9: 3.0
        //    Root of 27: 5.196152422706632

        StaticBlock blockOne = new StaticBlock(4);
        System.out.println("Number of blockOne: " + blockOne.number);
        // >> Initialisation constructor ...
        //    Number of blockOne: 4

        StaticBlock blockTwo = new StaticBlock(16);
        System.out.println("Number of blockTwo: " + blockTwo.number);
        // >> Initialisation constructor ...
        //    Number of blockTwo: 16
    }
}
