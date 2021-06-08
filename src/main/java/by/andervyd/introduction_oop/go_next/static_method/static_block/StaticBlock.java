package by.andervyd.introduction_oop.go_next.static_method.static_block;

public class StaticBlock {
    static double rootOf9;
    static double rootOf27;
    int number;

    static {
        System.out.println("Initialisation static ...");

        rootOf9 = Math.sqrt(9);
        rootOf27 = Math.sqrt(27);
    }

    StaticBlock(int number) {
        System.out.println("Initialisation constructor ...");

        this.number = number;
    }
}
