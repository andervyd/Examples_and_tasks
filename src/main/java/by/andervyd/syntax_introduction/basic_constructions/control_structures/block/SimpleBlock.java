package by.andervyd.syntax_introduction.basic_constructions.control_structures.block;

public class SimpleBlock {
    public static void main(String[] args) {

        int a = 3;
        int b = 5;

        if (a < b) { // start block
            int v = a + 4;
            int w = b + v;
        }            // end block
    }
}
