package by.andervyd.syntax_introduction.data_type.character_types;

public class CharDemo {
    public static void main(String[] args) {

        char charType = 'L';
        System.out.println("Char: " + charType);
        // >> Char: L

        for (int i = 0; i < 5; i++) {
            System.out.print(++charType + " ");
        } // >> M N O P Q
    }
}
