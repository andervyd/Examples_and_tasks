package by.andervyd.work_with_data.recursion.folder_view;

import java.io.File;
import java.util.Arrays;

public class FolderViewRec {

    public static void folderRec(String dir) {

        long modified = System.currentTimeMillis();

        File walkDir = new File(dir);
        String[] dirList = walkDir.list();

        for (int i = 0; i < dirList.length; i++) {
            File file = new File(dirList[i]);

            if (file.isDirectory()) {
                folderRec(file.getPath());
                continue;
            }
            file.setLastModified(modified);
        }
        System.out.println("Time: " + (modified / 1000));
        System.out.println("List: " + Arrays.toString(dirList));
        System.out.println("Done");
    }

    public static void main(String[] args) {

        folderRec("src/main/java/by/andervyd/work_with_data/recursion/folder_view/temp");
    }
}
