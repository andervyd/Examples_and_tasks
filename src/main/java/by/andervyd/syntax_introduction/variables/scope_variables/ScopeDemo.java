package by.andervyd.syntax_introduction.variables.scope_variables;

public class ScopeDemo {
    public static void main(String[] args) {

        int x; // everywhere
        x = 1;

        System.out.println("x: " + x);
        // >> x: 1
        {
            int y = 3; // only inner block
            System.out.println("x: " + x + ", y: " + y);
            // >> x: 1, y: 3
        }

        for (int i = 0; i < 3; i++) {
            int y = 100;
            System.out.println("Result: " + (y - i));
        } // >> Result: 100
          //    Result: 99
          //    Result: 98
    }
}
