package linkedlist;
//https://leetcode.com/problems/middle-of-the-linked-list/
public class MiddleElement {

    public Node<Integer> findMiddleNode(Node<Integer> head) {

        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
