package by.andervyd.strings_and_collections.strings.unicode;

import java.io.UnsupportedEncodingException;

public class UTF_8 {
    public static void main(String[] args) {

        try {
            String string = "abc/u5639/u563b";

            // to byte:
            byte[] utf8 = string.getBytes("UTF-8");
            for (byte bytes : utf8) {
                System.out.print(bytes);
            }
            // >> 97989947117535451574711753545198

            System.out.println("\n==============");

            // to string:
            string = new String(utf8, "UTF-8");
            System.out.println(string);
            // >> abc/u5639/u563b

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
