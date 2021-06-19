package by.andervyd.standard_libraries.work_with_number.hex_dec_oct_bin;

public class Ex00 {
    public static void main(String[] args) {

        int cisco;
        String string;

        // bin
        cisco = Integer.parseInt("111111", 2); // >> 63
        string = Integer.toString(cisco, 2);      // >> 111111 (to binary)

        // oct
        cisco = Integer.parseInt("77", 8);     // >> 63
        string = Integer.toString(cisco, 8);      // >> 77 (to octal)

        // dec
        cisco = Integer.parseInt("63");              // >> 63
        string = Integer.toString(cisco);               // >> 63 (to decimal)

        // hex
        cisco = Integer.parseInt("3F", 16);     // >> 63
        string = Integer.toString(cisco, 16);      // >> 3F (to hexadecimal)
    }
}
