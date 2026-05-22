public class LambdaThread {
    public static void main(String[] args) {

        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread Running: " + i);
            }
        };

        Thread t1 = new Thread(task);
        t1.start();
    }
}
