package by.andervyd.strings_and_collections.library_collections.add;

import java.util.HashMap;
import java.util.Map;

public class Ex00 {
    public static void main(String[] args) {

        Map map = new HashMap();

        Double refDouble1 = new Double(12.4);
        Double refDouble2 = 31.2;

        map.put("val1", refDouble1);
        map.put("val2", refDouble2);

        System.out.println(map.get("val1"));
        // >> 12.4
    }
}
