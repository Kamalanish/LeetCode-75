public class LinkedListStack<T> {

    private Node<T> top;
    private int size;

    public LinkedListStack() {
        top = null;
        size = 0;
    }

    public void push(T item) {

        Node<T> newNode = new Node<>(item);

        newNode.next = top;

        top = newNode;

        size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new java.util.EmptyStackException();
        }
        T item = top.data;

        top = top.next;

        size--;
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new java.util.EmptyStackException();
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }
}
