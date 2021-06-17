package by.andervyd.work_with_data.transformation.binary_form;

import java.io.PrintStream;

public class ShowBits {
    private int numBit;

    public ShowBits(int numBit) {
        this.numBit = numBit;
    }

    public String getBinaryForm(long value) {
        long mask = 1;
        String form = "";
        mask <<= numBit - 1;

        int spacer = 0;
        for (; mask != 0; mask >>>= 1) {
            if ((value & mask) != 0) {
                form += "1";
            } else {
                form += "0";
            }

            spacer++;
            if ((spacer % 8) == 0) {
                form += " ";
                spacer = 0;
            }
        }
        return form;
    }

    public void show(long value, PrintStream out) {
        String binaryForm = getBinaryForm(value);
        out.println(binaryForm);
    }
}
