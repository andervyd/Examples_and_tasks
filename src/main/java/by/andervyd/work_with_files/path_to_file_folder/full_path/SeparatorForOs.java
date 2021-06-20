package by.andervyd.work_with_files.path_to_file_folder.full_path;

import java.io.File;

public class SeparatorForOs {
    public static void main(String[] args) {

        String path =
                "root" + File.separator + "folder" + File.separator + "info.txt";

        System.out.println("Path: " + path);
    }
    // >> Path: root/folder/info.txt
}
