package by.andervyd.work_with_files.actions_on_file_folder.make_delete_file;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {

        File file = new File
                ("src/main/java/by/andervyd/work_with_files/actions_on_file_folder/make_delete_file/temp/text.txt");

        boolean isDelete = file.delete();

        if (isDelete) {
            System.out.println("File " + file.getName() + " is deleted");
        } else {
            System.out.println("File " + file.getName() + " isn't deleted");
        }
    }
}
