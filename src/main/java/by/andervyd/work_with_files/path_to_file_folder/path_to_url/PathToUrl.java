package by.andervyd.work_with_files.path_to_file_folder.path_to_url;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class PathToUrl {
    public static void main(String[] args) {

        URL url = null;
        File file = new File("text.txt");

        try {
            url = file.toURL();
            System.out.println(url);
            // >> file:/home/andervyd/Java/Examples_and_tasks/text.txt

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        file = new File(url.getFile());
        System.out.println(file);
        // >> /home/andervyd/Java/Examples_and_tasks/text.txt
    }
}
