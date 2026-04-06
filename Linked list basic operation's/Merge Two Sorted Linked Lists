public class MergeSortedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node merge(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node temp = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        temp.next = (l1 != null) ? l1 : l2;

        return dummy.next;
    }
}
