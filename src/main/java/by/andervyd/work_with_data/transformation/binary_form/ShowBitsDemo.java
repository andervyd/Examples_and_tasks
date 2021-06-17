package by.andervyd.work_with_data.transformation.binary_form;

import java.io.PrintStream;

public class ShowBitsDemo {

    private static PrintStream out = System.out;

    public static void main(String[] args) {

        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);

        out.print("128 in binary: ");
        b.show(128, out);
        // >> 128 in binary: 10000000

        out.print("87987 in binary: ");
        i.show(87987, out);
        // >> 87987 in binary: 00000000 00000001 01010111 10110011

        out.print("237658768 in binary: ");
        li.show(237658768, out);
        // >> 237658768 in binary: 00000000 00000000 00000000 00000000 00001110 00101010 01100010 10010000

        out.print("Lower 8 bits of number 87987 in binary form: ");
        b.show(87987, out);
        // >> lower 8 bits of number 87987 in binary form: 10110011
    }
}
