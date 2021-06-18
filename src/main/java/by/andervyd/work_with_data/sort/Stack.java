package by.andervyd.work_with_data.sort;

public class Stack {                            // LIFO
    private Object[] theArray;
    private int topOfStack;
    static final int DEFAULT_CAPACITY = 10;

    public Stack() {
        theArray = new Object[DEFAULT_CAPACITY];
        topOfStack = -1;
    }

    boolean isEmpty() {
        return topOfStack == -1;
    }

    Object top() {
        if (isEmpty()) {
            return null;
        }
        return theArray[topOfStack];
    }

    void pop() {
        if (isEmpty()) {
            return;
        }
        topOfStack--;
    }

    Object topAndPop() {
        if (isEmpty()) {
            return null;
        }
        return theArray[topOfStack--];
    }

    void push(Object obj) {
        if (topOfStack + 1 == theArray.length) {
            doubleArray();
        }
        theArray[++topOfStack] = obj;
    }

    void makeEmpty() {
        topOfStack = -1;
    }

    private void doubleArray() {
        Object[] newArray;
        newArray = new Object[theArray.length * 2];

        for (int i = 0; i < theArray.length; i++) {
            System.arraycopy
                    (theArray, 0, newArray, 0, theArray.length);
        }
        theArray = newArray;
    }
}