package by.andervyd.work_with_data.transformation.lowercase;

public class LowCase {
    public static void main(String[] args) {

        char ch;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch + "-");

            ch = (char) (ch | 0x20); // turn On 6 bit
            System.out.print(ch + "; ");
        }
        // >> A-a; B-b; C-c; D-d; E-e; F-f; G-g; H-h; I-i; J-j;
    }
}
