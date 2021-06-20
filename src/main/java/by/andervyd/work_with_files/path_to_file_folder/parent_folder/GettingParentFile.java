package by.andervyd.work_with_files.path_to_file_folder.parent_folder;

import java.io.File;

public class GettingParentFile {
    public static void main(String[] args) {

        File file = new File("text.txt");
        String parentPath = file.getParent();

        File parentFolder = file.getParentFile();

        System.out.println(parentPath);
        System.out.println(parentFolder);
    }
}
