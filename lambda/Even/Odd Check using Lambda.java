import java.util.function.Predicate;

public class EvenOddLambda {
    public static void main(String[] args) {

        Predicate<Integer> isEven = num -> num % 2 == 0;

        int number = 10;

        if (isEven.test(number)) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }
}
