package by.andervyd.work_with_files.reading_writing_file.reading_bin_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadingBinFile {
    public static void main(String[] args) {

        File file = new File
                ("src/main/java/by/andervyd/work_with_files/reading_writing_file/temp/text.bin");

        try (InputStream reader = new FileInputStream(file)) {
            long length = file.length();

            if (length > Integer.MAX_VALUE) {
                throw new IOException("File " + file.getName() + " is long");
            }

            byte[] bytes = new byte[(int) length];

            int offset = 0;
            int numRead = 0;
            while (offset < bytes.length &&
                    (numRead = reader.read(bytes, offset, bytes.length - offset)) >= 0) {
                offset += numRead;
            }

            if (offset < bytes.length) {
                throw new IOException("Don't read file");
            }

            for (int i = 0; i < bytes.length; i++) {
                if (i % 10 == 0) {
                    System.out.println();
                }
                System.out.print(bytes[i] + " ");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // >>   48 49 32 48 48 32 48 48 32 48
    //      48 32 55 56 32 48 50 32 48 48
    //      ...
    //      57 97 32 46 46 46 46 46 46 48
    //      46 46 46 88 46 46 46 82 46
}


