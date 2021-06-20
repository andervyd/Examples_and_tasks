package by.andervyd.work_with_files.reading_writing_file.filter_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class GrepDemo {
    public static void main(String[] args) {

        if ((args.length == 0) || (args.length > 2)) {
            System.out.println("Usage: java Grep");
            System.exit(0);
        }

        try (FileInputStream input = new FileInputStream(args[1]);
             GrepInputStream grep = new GrepInputStream(input, args[0])) {

            String line;

            for (;;) {
                line = grep.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
