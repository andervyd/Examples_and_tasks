package by.andervyd.work_with_files.path_to_file_folder.absolute_path;

import java.io.File;

public class GettingAbsolutePath {
    public static void main(String[] args) {

        File file = new File("test.txt");

        System.out.println("Relative path: " + file.getPath());
        System.out.println("Absolute path: " + file.getAbsolutePath());
    }
    // >> Relative path: test.txt
    //    Absolute path: /home/andervyd/Java/Examples_and_tasks/test.txt
}
