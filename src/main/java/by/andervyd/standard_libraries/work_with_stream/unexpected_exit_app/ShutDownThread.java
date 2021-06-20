package by.andervyd.standard_libraries.work_with_stream.unexpected_exit_app;

public class ShutDownThread extends Thread {
    @Override
    public void run() {
        System.out.println("\tApp is ending");
        System.out.println("\tBut you can change something");
    }
}
