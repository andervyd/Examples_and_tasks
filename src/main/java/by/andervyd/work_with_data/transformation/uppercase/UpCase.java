package by.andervyd.work_with_data.transformation.uppercase;

public class UpCase {
    public static void main(String[] args) {

        char ch;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('a' + i);
            System.out.print(ch + "-");

            // 65503 or 1111111111011111 (0xffdf)
            ch = (char) (ch & 0xffdf); // turn Off 6 bit
            System.out.print(ch + "; ");
        }
        // >> a-A; b-B; c-C; d-D; e-E; f-F; g-G; h-H; i-I; j-J;

        System.out.println("\n" + "a-" + (char)('a' & 0xffdf)); // (a) 110 001 & 1111111111011111
        // >> a-A
    }
}
