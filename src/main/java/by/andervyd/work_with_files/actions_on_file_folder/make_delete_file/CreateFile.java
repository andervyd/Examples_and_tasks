package by.andervyd.work_with_files.actions_on_file_folder.make_delete_file;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {

        try {
            File file = new File
                ("src/main/java/by/andervyd/work_with_files/actions_on_file_folder/make_delete_file/temp/text.txt");
            boolean isCreate = file.createNewFile();

            if (isCreate) {
                System.out.println("File " + file.getName() + " is created");
            } else {
                System.out.println("Something wrong");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
