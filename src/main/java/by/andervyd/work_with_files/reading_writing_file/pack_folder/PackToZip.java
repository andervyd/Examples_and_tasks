package by.andervyd.work_with_files.reading_writing_file.pack_folder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class PackToZip {
    public static void main(String[] args) {

        String pathFolder =
                "src/main/java/by/andervyd/work_with_files/reading_writing_file/pack_folder/temp.zip";

        String pathFile =
                "src/main/java/by/andervyd/work_with_files/reading_writing_file/pack_folder/temp/test.txt";

        try (FileOutputStream fileOutputStream = new FileOutputStream(pathFolder);
             ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
             FileInputStream fileInputStream = new FileInputStream(pathFile)) {

            ZipEntry zipEntry = new ZipEntry(pathFile);
            zipOutputStream.putNextEntry(zipEntry);

            byte[] readBuffer = new byte[2048];
            int bytesRead = 0;

            while ((bytesRead = fileInputStream.read(readBuffer)) == -1) {
                zipOutputStream.write(readBuffer, 0, bytesRead);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
