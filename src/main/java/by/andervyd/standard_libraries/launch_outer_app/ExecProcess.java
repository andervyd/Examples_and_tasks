package by.andervyd.standard_libraries.launch_outer_app;

import java.io.IOException;

public class ExecProcess {
    public static void main(String[] args) {

        try {
            Runtime.getRuntime().exec("/usr/bin/gnome-text-editor");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
