package by.andervyd.strings_and_collections.strings.method;

public class Example {
    public static void main(String[] args) {

    // substring()
        int start = 6;
        int end = 11;
        String greetings = "Hello World";
        String subString = greetings.substring(start, end);
        System.out.println(subString);
        // >> World

    // indexOf() or lastIndexOf()
        int index;
        String newGreetings = "Hello World";

        index = newGreetings.indexOf("H");
        System.out.println(index);
        // >> 0

        index = newGreetings.indexOf("B");
        System.out.println(index);
        // >> -1

    // startsWith() or endsWith()
        boolean isCheck;
        String string = "Hi from Universe";

        isCheck = string.startsWith("Hi");
        System.out.println(isCheck);
        // >> true

        isCheck = string.endsWith("Bye");
        System.out.println(isCheck);
        // >> false

    // charAt()
        String str = "Hi";
        char c = str.charAt(0);
        System.out.println(c);
        // >> H

    // replace()
        String str2 = "Helly";
        str2 = str2.replace("y", "o");
        System.out.println(str2);
        // >> Hello

    // toLowerCase() or toUpperCase()
        String string1 = "Welcome";

        String lower = string1.toLowerCase();
        System.out.println(lower);
        // >> welcome

        String upper = string1.toUpperCase();
        System.out.println(upper);
        // >> WELCOME

    // parseXXX() | XXX: Integer, Long, Float, Double
        String number = "1200";
        int parseNumber = Integer.parseInt(number);
        System.out.println(parseNumber);
        // >> 1200

    // transformation all simple type
        int num = 1200;

        String s1 = "" + num;
        System.out.println(s1);
        // >> 1200

        String s2 = String.valueOf(num);
        System.out.println(s2);
        // >> 1200

        String s3 = Integer.toString(num);
        System.out.println(s3);
        // >> 1200

    }
}
