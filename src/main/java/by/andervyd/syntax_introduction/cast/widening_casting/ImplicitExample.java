package by.andervyd.syntax_introduction.cast.widening_casting;

public class ImplicitExample {
    public static void main(String[] args) {

        // Automatic Type Conversion
        byte i = 40;

        short j = i;
        int k = j;
        long l = k;
        float m = l;
        double n = m;

        System.out.println("byte value : " + i);
        System.out.println("short value : " + j);
        System.out.println("int value : " + k);
        System.out.println("long value : " + l);
        System.out.println("float value : " + m);
        System.out.println("double value : " + n);
    }
}
