package by.andervyd.standard_libraries.outer_on_console;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class LogReader {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Call: java LogReader error.log");
            System.exit(0);
        }

        String logFile;
        BufferedReader reader;

        logFile = args[0];
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(logFile)));

            while (true) {
                String line = reader.readLine();
                if (line != null) {
                    System.out.println(line);
                } else {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
