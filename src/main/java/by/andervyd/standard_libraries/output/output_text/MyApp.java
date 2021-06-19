package by.andervyd.standard_libraries.output.output_text;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class MyApp {
    public static void main(String[] args) {

        try {
            PrintStream errOut = new PrintStream(new FileOutputStream
                    ("src/main/java/by/andervyd/standard_libraries/output_text/temp/Error.log"));
            System.setErr(errOut);

            PrintStream sysOut = new PrintStream(new FileOutputStream
                    ("src/main/java/by/andervyd/standard_libraries/output_text/temp/Debug.log"));
            System.setOut(sysOut);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Application working normally");
        System.err.println("Message about error");
    }
}
