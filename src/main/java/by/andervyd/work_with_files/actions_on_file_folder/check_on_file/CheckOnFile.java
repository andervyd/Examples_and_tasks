package by.andervyd.work_with_files.actions_on_file_folder.check_on_file;

import java.io.File;

public class CheckOnFile {

    public static boolean isFileExists(String fileName) {
        boolean result = false;

        File file = null;

        try {
            file = new File(fileName);
            result = file.exists();
        } catch (SecurityException se) {
            result = true;
        } finally {
            if (file != null) {
                file = null;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        boolean isFile = isFileExists("text.txt");
        System.out.println("text.txt is " + isFile);
        // >> text.txt is false
    }
}
