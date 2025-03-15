package arrays;

import java.util.Arrays;

public class DynamicList {

    private static final int DEFAULT_SIZE = 10;

    private int size = 0;


    private int[] array;

    public DynamicList() {
        array = new int[DEFAULT_SIZE];
    }

    public DynamicList(int size) {
        array = new int[size];
    }

    public int size() {
        return size;
    }

    public void add(int val) {
        ensureCapacity();
        array[size++] = val;
    }

    public int get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Out of range");
        }
        return array[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }

        System.arraycopy(array, index + 1, array, index, size - 1);
    }

    // Ensure capacity (Double size when full)
    private void ensureCapacity() {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
    }

}
