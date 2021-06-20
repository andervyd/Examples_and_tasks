package by.andervyd.work_with_files.path_to_file_folder.check_file_or_folder;

import java.io.File;

public class CheckOnFile {
    public static void main(String[] args) {

        File spec = new File("test.txt");
        boolean isFile = spec.isFile();

        if (isFile) {
            System.out.println(spec.getName() + " is file");
        } else {
            System.out.println(spec.getName() + " is folder");
        }
    }
}
