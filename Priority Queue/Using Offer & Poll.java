import java.util.LinkedList;
import java.util.Queue;

public class QueueOfferPoll {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");

        System.out.println("Queue: " + queue);

        while (!queue.isEmpty()) {
            System.out.println("Processing: " + queue.poll());
        }
    }
}