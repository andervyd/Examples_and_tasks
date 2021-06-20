package by.andervyd.work_with_files.reading_writing_file.reading_txt_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingTxtFile {
    public static void main(String[] args) {

        try (FileReader file = new FileReader
                ("src/main/java/by/andervyd/work_with_files/reading_writing_file/temp/text.txt");
             BufferedReader reader = new BufferedReader(file)) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // >> line 1
    //    line 2
    //    line 3
}
