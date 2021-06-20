package by.andervyd.work_with_files.reading_writing_file.writing_txt_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WritingTxtFile {
    public static void main(String[] args) {

        try (FileWriter file = new FileWriter
                ("src/main/java/by/andervyd/work_with_files/reading_writing_file/temp/text.txt", true);
             BufferedWriter writer = new BufferedWriter(file)) {

            writer.write("\nline 4 (new)");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
