package by.andervyd.standard_libraries.program_management.simple_app;

public class ByeBye {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        System.out.println("ByeBye...");
    }
}
