package by.andervyd.strings_and_collections.library_collections.iteration;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); // Set
        list.add(1);
        list.add(2);
        list.add(3);

        // #1
        for (Integer value : list) {
            System.out.print(value + " ");
        }
        // >> 1 2 3

        System.out.println("\n=====");

        // #2
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        // >> 1 2 3

    }
}
