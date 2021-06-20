package by.andervyd.standard_libraries.work_with_stream.atomic_operation;

public class ThreadSafePoint {
    private int x;
    private int y;
    private int value;

    // NOT atomic (read => increment => new value)
    public void increment() {
        ++this.value;
    }

    // atomic (synchronized)
    public synchronized void incrementAtomic() {
        ++this.value;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
