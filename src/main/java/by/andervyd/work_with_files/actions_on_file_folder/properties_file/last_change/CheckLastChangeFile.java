package by.andervyd.work_with_files.actions_on_file_folder.properties_file.last_change;

import java.io.File;
import java.util.Date;

public class CheckLastChangeFile {

    public static void touch(String path) {
        long time = System.currentTimeMillis();
        File file = new File(path);
        boolean touched = file.setLastModified(time);

        if (!touched) {
            System.err.println("Can't set time");
        } else {
            System.out.println(file.lastModified());
        }
    }

    public static void main(String[] args) {

        File file = new File
                ("src/main/java/by/andervyd/work_with_files/actions_on_file_folder/properties_file/temp/text.txt");
        long modifier = file.lastModified();
        Date date = new Date(modifier);

        System.out.println(date.getTime());
        // >> 1624175683526

        touch("src/main/java/by/andervyd/work_with_files/actions_on_file_folder/properties_file/temp/text.txt");
        // >> 1624175690014
    }
}
