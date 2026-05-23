import java.util.*;

public class SquareNumbersLambda {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.forEach(num ->
                System.out.println(
                        "Square of " + num + " = " + (num * num)
                )
        );
    }
}
