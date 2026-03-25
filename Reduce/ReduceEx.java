import java.util.Arrays;
import java.util.List;
//Concat two strings using reduce
public class ReduceEx{
public static void main(String[] args) {
    List<String> list = Arrays.asList("java", "Steam", "API","Reduce");
    String result = list.stream().reduce(" ", (a,b) -> a+b );
    System.out.println(result);

 }
}