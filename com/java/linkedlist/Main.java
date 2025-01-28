package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.insertAtBeginning(1);
        linkedList.insertAtBeginning(2);
        linkedList.insertAtBeginning(3);
        linkedList.insertAtPos(5,0);
        linkedList.insertAtPos(6,0);
        linkedList.insertAtPos(7,0);

        System.out.println(linkedList);
        System.out.println(linkedList.size());
        System.out.println(linkedList.getElement(2));

    }
}
