package by.andervyd.standard_libraries.output.output_ru_symbol.class_cp866;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public final class RusPrintStream extends PrintStream {

    public RusPrintStream() throws UnsupportedEncodingException {
        super(System.out, true, "Cp866");
    }
}
