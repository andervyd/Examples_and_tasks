package by.andervyd.standard_libraries.work_with_stream.unexpected_exit_app;

public class ShutDownHook {

    public ShutDownHook() {
    }

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        runtime.addShutdownHook(new ShutDownThread());
        runtime = null;

        try {
            System.out.println("The app will wait 100 seconds before closing");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    // >> The app will wait 100 seconds before closing
    //	    App is ending
    //	    But you can change something
}
