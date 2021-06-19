package by.andervyd.standard_libraries.program_management.open_file;

import java.io.IOException;

public class OpenHTMLFile {
    public static void main(String[] args) {

        String app = null;
        Runtime runtime = Runtime.getRuntime();
        boolean linux = System
                            .getProperty("os.name")
                                .toLowerCase()
                                    .startsWith("linux");

        if (linux == true) {
            app = "/usr/bin/google-chrome index.html";
        } else {
            System.out.println("Not correctly platform");
        }

        try {
            runtime.exec(app);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
