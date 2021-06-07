package by.andervyd.syntax_introduction.basic_constructions.control_structures.operator_for;

public class ForStatementDemo {
    public static void main(String[] args) {

        for (int count = 0; count < 5; count++) {
            System.out.println("Variable of loop: " + count);
        }
        System.out.println("Loop ending.");
    }
} /* >> Variable of loop: 0
        Variable of loop: 1
        Variable of loop: 2
        Variable of loop: 3
        Variable of loop: 4
        Loop ending.
*/
