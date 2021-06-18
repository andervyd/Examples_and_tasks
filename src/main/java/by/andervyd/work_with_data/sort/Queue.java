package by.andervyd.work_with_data.sort;

public class Queue {             // FIFO
    private char[] q;
    private int putLoc;
    private int getLoc;

    Queue(int size) {
        q = new char[size + 1];
        getLoc = putLoc = 0;
    }

    Queue(Queue queue) {
        putLoc = queue.putLoc;
        getLoc = queue.getLoc;
        q = new char[queue.q.length];

        System.arraycopy(queue.q, 0, q, 0, queue.q.length);
    }

    Queue(char[] ch) {
        putLoc = 0;
        getLoc = 0;
        q = new char[ch.length + 1];

        for (int i = 0; i < ch.length; i++) {
            put(ch[i]);
        }
    }

    boolean isFull() {
        return (putLoc == (q.length - 1));
    }

    boolean isEmpty() {
        return (getLoc == putLoc);
    }

    void put(char ch) throws IllegalStateException {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }

        putLoc++;
        q[putLoc] = ch;
    }

    char get() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        getLoc++;
        return q[getLoc];
    }
}





















