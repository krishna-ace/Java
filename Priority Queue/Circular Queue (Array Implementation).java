class CircularQueue {
    int[] arr;
    int front, rear, size, capacity;

    CircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = size = 0;
        rear = capacity - 1;
    }

    void enqueue(int item) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        size++;
    }

    int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}

public class CircularQueueDemo {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();
        q.display();
    }
}