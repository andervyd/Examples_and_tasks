package by.andervyd.syntax_introduction.other_control_operators.switch_operator;

public class Example {
    public static void main(String[] args) {

        String name = "Bob";

        switch (name) {
            case "Poll" :
                System.out.println("It's Poll");
                break;
            case "Bob" :
                System.out.println("It's Bob");
                break;
            case "John" :
                System.out.println("It's John");
                break;
            default:
                System.out.println("No matches");
        } // >> It's Bob
    }
}
