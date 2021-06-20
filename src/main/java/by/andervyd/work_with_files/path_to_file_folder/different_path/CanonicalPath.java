package by.andervyd.work_with_files.path_to_file_folder.different_path;

import java.io.File;
import java.io.IOException;

public class CanonicalPath {
    public static void main(String[] args) {
        
        boolean result;

        File file1 = new File("./text.txt"); // absolute path
        File file2 = new File("text.txt");   // relative path

        result = file1.equals(file2);

        if (!result) {
            System.out.println("Files are different");
        } else {
            System.out.println("The files are the same");
        }
        // >> Files are different

        try {
            String sFile1 = file1.getCanonicalPath();
            String sFile2 = file2.getCanonicalPath();

            result = sFile1.equals(sFile2);

            if (!result) {
                System.out.println("Files are different");
            } else {
                System.out.println("The files are the same");
            }
            // >> The files are the same

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
