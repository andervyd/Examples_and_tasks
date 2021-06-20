package by.andervyd.work_with_files.reading_writing_file.random_writing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomWritingToFile {
    public static void main(String[] args) {

        File file = new File
                ("src/main/java/by/andervyd/work_with_files/reading_writing_file/temp/new_text.txt");

        try (RandomAccessFile randomAccessFile =
                     new RandomAccessFile(file, "rw")) {

            char ch = randomAccessFile.readChar();
            System.out.println(ch);

            randomAccessFile.seek(file.length());

            randomAccessFile.writeChars("\nend line");

            System.out.println("Done");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
