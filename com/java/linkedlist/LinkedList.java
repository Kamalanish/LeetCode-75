package linkedlist;

public class LinkedList<T> {

    Node<T> head;
    int size;


    public LinkedList() {
        this.head = null;
        size = 0;
    }

    // O(1)
    public void insertAtBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head; // Works even if head is null
        head = newNode;
        size++;
    }

    public void insertAtPos(T data, int position) {

        if (position < 0 || position > size) {
            throw new IllegalArgumentException("Invalid position to insert");
        }
        Node<T> newNode = new Node<>(data);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            size++;
        } else {
            Node<T> prev = head;
            for (int i = 1; i < position-1; i++) {
                prev = prev.next;
            }
            newNode.next = prev.next;
            prev.next = newNode;
            size++;
        }
    }

    //O(N)
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node<T> current = head;
        while (current != null) {
            builder.append(current.data).append(" -> ");
            current = current.next;
        }
        builder.append("null");
        return builder.toString();
    }

    //O(N)
    public T getElement(int position) {

        if (position < 0 || position >= size) {
            throw new IllegalArgumentException("Invalid position");
        }
        Node<T> current = head;

        for (int i = 0; i < position; i++) {
            current = current.next;
        }
        return current.data;
    }

    //O(N)
    public void update(T data, int position) {
        if (position < 0 || position >= size) {
            throw new IllegalArgumentException("Invalid position");
        }
        Node<T> current = head;
        for (int i = 0; i < position; i++) {
            current = current.next;
        }
        current.data = data;

    }

    public int size() {
        return size;
    }
}