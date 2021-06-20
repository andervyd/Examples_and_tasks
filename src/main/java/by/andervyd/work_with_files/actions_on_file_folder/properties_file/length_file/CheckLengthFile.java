package by.andervyd.work_with_files.actions_on_file_folder.properties_file.length_file;

import java.io.File;

public class CheckLengthFile {
    public static void main(String[] args) {

        File file = new File("text.txt");
        System.out.println("Length " + file.getName() + ": " + file.length());
        // >> Length text.txt: 0
    }
}
