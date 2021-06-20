package by.andervyd.work_with_files.actions_on_file_folder.properties_file.rename_file;

import java.io.File;

public class RenameFile {
    public static void main(String[] args) {

        File oldFile = new File("src/main/java/by/andervyd/work_with_files/" +
                "actions_on_file_folder/properties_file/temp/text.txt");

        File newFile = new File("src/main/java/by/andervyd/work_with_files/" +
                "actions_on_file_folder/properties_file/temp/info.txt");

        boolean renamed = oldFile.renameTo(newFile);

        if (!renamed) {
            System.err.println("File " + oldFile.getName() + " not rename to " + newFile.getName());
        } else {
            System.out.println("File " + oldFile.getName() + " rename to " + newFile.getName());
        }
    }
}
