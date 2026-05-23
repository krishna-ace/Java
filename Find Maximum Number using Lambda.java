import java.util.*;

public class MaxNumberLambda {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 45, 67, 23, 89, 12);

        int max = numbers.stream()
                .max((a, b) -> a.compareTo(b))
                .get();

        System.out.println("Maximum Number: " + max);
    }
}
