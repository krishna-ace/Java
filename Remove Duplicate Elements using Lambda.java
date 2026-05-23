import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesLambda {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
                1, 2, 2, 3, 4, 4, 5, 5, 6
        );

        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Unique Elements:");
        uniqueNumbers.forEach(num -> System.out.println(num));
    }
}
