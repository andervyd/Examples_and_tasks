package by.andervyd.work_with_data.transformation.bit_to_byte;

import java.io.PrintStream;

public class ByteBits {

    private static PrintStream out = System.out;

    public static void main(String[] args) {
        byte value = 123;

        System.out.print("value " + value + ": " );
        for (int i = 128; i > 0; i /= 2) {
            if ((value & i) != 0) {
                out.print("1");
            } else {
                out.print("0");
            }
        }
        // >> value 123: 01111011
    }
}
