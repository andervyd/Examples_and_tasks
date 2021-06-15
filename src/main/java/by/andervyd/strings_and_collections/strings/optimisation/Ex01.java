package by.andervyd.strings_and_collections.strings.optimisation;

public class Ex01 {
    public static void main(String[] args) {

        // #1
        String str1 = "Line one - ";
        String str2 = "Line two";
        String string = str1 + str2;

        System.out.println(string);
        // >> Line one - Line two

        // #2
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Line one - ");
        stringBuffer.append("Line two");
        System.out.println(stringBuffer);
        // >> Line one - Line two

        // #3
        StringBuffer stringBuffer1 = new StringBuffer(52);
        stringBuffer1.append("Line one - ");
        stringBuffer1.append("Line two");
        String string1 = stringBuffer1.toString();
        System.out.println(string1);
        // >> Line one - Line two
    }
}
