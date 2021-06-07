package by.andervyd.syntax_introduction.basic_constructions.control_structures.operator_if;

public class SimpleIfExample {
    public static void main(String[] args) {

        int var = 99;

        if (var < 100) {
            System.out.println("Condition is met.");
        }
        // >> Condition is met.

        if (var > 100) {
            System.out.println("Condition not met.");
        }

        if (99 > 100) {
            System.out.println("The condition will not be met.");
        }
    }
}
