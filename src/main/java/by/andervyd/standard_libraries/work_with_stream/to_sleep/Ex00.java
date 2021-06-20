package by.andervyd.standard_libraries.work_with_stream.to_sleep;

public class Ex00 {
    public static void main(String[] args) {

        long millis = 1000;

        for (int i = 0; i < 10; i++) {
            try {
                System.out.print(i + " ");
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
