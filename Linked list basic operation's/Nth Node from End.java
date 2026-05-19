class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class NthFromEnd {
    Node head;

    public void printNthFromEnd(int n) {
        Node fast = head, slow = head;

        for (int i = 0; i < n; i++) {
            if (fast == null) return;
            fast = fast.next;
        }

        while (fast != null
