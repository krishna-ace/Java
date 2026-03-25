import java.util.stream.IntStream;
public class Main {
    public static void main(String[] args) {
        int n = 5;
        int factorial = IntStream.rangeClosed(1, n) .reduce(1, (a, b) -> a * b);
        System.out.println(factorial); // Output: 120
    }
}
