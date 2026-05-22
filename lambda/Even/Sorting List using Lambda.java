import java.util.*;

public class SortNamesLambda {
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Krishna",
                "Aman",
                "Rahul",
                "Zoya"
        );

        names.sort((a, b) -> a.compareTo(b));

        System.out.println("Sorted Names:");
        names.forEach(name -> System.out.println(name));
    }
}
