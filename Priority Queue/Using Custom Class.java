import java.util.LinkedList;
import java.util.Queue;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class CustomQueueExample {
    public static void main(String[] args) {
        Queue<Student> queue = new LinkedList<>();

        queue.offer(new Student(1, "Aman"));
        queue.offer(new Student(2, "Riya"));
        queue.offer(new Student(3, "Karan"));

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}