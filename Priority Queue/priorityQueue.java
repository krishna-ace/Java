import java.util.PriorityQueue;
import java.util.Collections;

public class CompletePriorityQueueDemo {
    public static void main(String[] args) {
        // MIN-HEAP (smallest element has highest priority)
        System.out.println("=== MIN-HEAP (Default) ===");
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // Insertion
        minHeap.add(25);
        minHeap.add(15);
        minHeap.add(35);
        minHeap.add(5);
        System.out.println("Queue: " + minHeap);
        
        // Peek - view highest priority element without removing
        System.out.println("Peek: " + minHeap.peek());
        
        // Deletion - remove highest priority element
        System.out.println("Poll: " + minHeap.poll());
        System.out.println("After poll: " + minHeap);
        
        // MAX-HEAP (largest element has highest priority)
        System.out.println("\n=== MAX-HEAP (Using Comparator) ===");
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        // Insertion
        maxHeap.offer(25);
        maxHeap.offer(15);
        maxHeap.offer(35);
        maxHeap.offer(5);
        System.out.println("Queue: " + maxHeap);
        
        // Peek
        System.out.println("Peek (largest): " + maxHeap.peek());
        
        // Deletion
        System.out.println("Poll: " + maxHeap.poll());
        System.out.println("After poll: " + maxHeap);
    }
}