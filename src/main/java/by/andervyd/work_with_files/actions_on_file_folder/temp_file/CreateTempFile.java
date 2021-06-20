package by.andervyd.work_with_files.actions_on_file_folder.temp_file;

import java.io.File;
import java.io.IOException;

public class CreateTempFile {

    public static File createTempFile(String prefix, String suffix) {
        File file = null;
        try {
            file = File.createTempFile(prefix, suffix);
            file.deleteOnExit();    // delete file when close app
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    public static void main(String[] args) {

        File file = createTempFile("text", ".txt");
        System.out.println("Path: " + file.getAbsolutePath());
        // >> Path: /tmp/text157464542339222980.txt
    }
}
