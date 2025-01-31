package stack;

import java.util.EmptyStackException;

public class ArrayStack<T> {


    protected T[] data;

    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public ArrayStack() {
        this(DEFAULT_SIZE);
    }

    public ArrayStack(int size) {
        this.data = (T[]) new Object[size];
    }

    public boolean push(T item) {

        if (isFull()) {
            return false;
        }
        ptr++;

        data[ptr] = item;

        return true;
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T removed = data[ptr];
        ptr--;
        return removed; // return data[ptr--];
    }

    public T peek(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return data[ptr];
    }

}
