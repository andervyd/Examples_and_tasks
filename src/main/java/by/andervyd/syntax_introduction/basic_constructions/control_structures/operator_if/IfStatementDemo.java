package by.andervyd.syntax_introduction.basic_constructions.control_structures.operator_if;

public class IfStatementDemo {
    public static void main(String[] args) {

        int a, b, c, d;

        a = 2;
        b = 3;

        System.out.println("a equals 2, b equals 3");
        if (a < b) {
            System.out.println("a less b");
        } // >> a less b

        if (a > b) {
            System.out.println("This text you will never see");
        }

        System.out.println("");

        c = a - b;
        System.out.println("c equals -1");
        if (c >= 0) {
            System.out.println("c has a positive meaning");
        }
        if (c < 0) {
            System.out.println("c has a negative meaning");
        } // >> c has a negative meaning

        System.out.println("");

        d = b - a;
        System.out.println("d equals 1");
        if (d >= 0) {
            System.out.println("c has a positive meaning");
        } // >> c has a positive meaning

        if (d < 0) {
            System.out.println("c has a negative meaning");
        }

        System.out.println("");

        if (a + c != b) {
            System.out.println("a plus c not equals b");
        } // >> a plus c not equals b

        if (a + d == b) {
            System.out.println("a plus d equal b");
        } // >> a plus d equal b
    }
}
