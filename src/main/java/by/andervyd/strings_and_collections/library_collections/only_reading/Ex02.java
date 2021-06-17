package by.andervyd.strings_and_collections.library_collections.only_reading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {

        List<String> name = Arrays.asList("Bob", "Poll");
        List list = Collections.unmodifiableList(name);

        list.set(0, "Mo"); // Exception: UnsupportedOperationException
    }
}
