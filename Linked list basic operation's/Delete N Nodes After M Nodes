class DeleteNafterM {
    Node head;

    void deleteNodes(int m, int n) {
        Node curr = head;

        while (curr != null) {
            for (int i = 1; i < m && curr != null; i++) {
                curr = curr.next;
            }

            if (curr == null) return;

            Node temp = curr.next;
            for (int i = 0; i < n && temp != null; i++) {
                temp = temp.next;
            }

            curr.next = temp;
            curr = temp;
        }
    }
}
