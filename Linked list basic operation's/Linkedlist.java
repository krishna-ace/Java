singly linked list:

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    
    // Create - Add node at the end
    void create(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            return;
        }
        
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    
    // Insert at specific position (0-based index)
    void insert(int data, int position) {
        Node newNode = new Node(data);
        
        // Insert at beginning
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        
        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        
        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }
        
        newNode.next = current.next;
        current.next = newNode;
    }
    
    // Delete node by value
    void delete(int key) {
        if (head == null) return;
        
        // If head node itself holds the key
        if (head.data == key) {
            head = head.next;
            return;
        }
        
        Node current = head;
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }
        
        if (current.next != null) {
            current.next = current.next.next;
        }
    }
    
    // Traverse and print in normal order
    void traverse() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    // Recursive helper method to print in reverse
    private void printReverseRecursive(Node node) {
        if (node == null) {
            return;
        }
        printReverseRecursive(node.next);
        System.out.print(node.data + " -> ");
    }
    
    // Public method to print list in reverse order
    void printReverse() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("Reverse order: ");
        printReverseRecursive(head);
        System.out.println("null");
    }
}

// Test the LinkedList
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        // Create elements
        list.create(10);
        list.create(20);
        list.create(30);
        list.create(40);
        
        System.out.println("Original list:");
        list.traverse();  // 10 -> 20 -> 30 -> 40 -> null
        
        // Print in reverse using recursion
        list.printReverse();  // 40 -> 30 -> 20 -> 10 -> null
        
        // Verify original list is unchanged
        System.out.println("\nOriginal list after reverse print:");
        list.traverse();  // 10 -> 20 -> 30 -> 40 -> null
        
        // Test other operations
        System.out.println("\n--- Testing other operations ---");
        list.insert(15, 1);
        System.out.print("After inserting 15 at position 1: ");
        list.traverse();  // 10 -> 15 -> 20 -> 30 -> 40 -> null
        
        list.delete(30);
        System.out.print("After deleting 30: ");
        list.traverse();  // 10 -> 15 -> 20 -> 40 -> null
    }
}