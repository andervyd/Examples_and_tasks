package by.andervyd.strings_and_collections.strings.immutable;

public class Ex00 {
    public static void main(String[] args) {

        String str = "Hello";
        String sentence = str.concat(" World");

        System.out.println(str);
        System.out.println(sentence);
        // >> Hello
        //    Hello World
    }
}
