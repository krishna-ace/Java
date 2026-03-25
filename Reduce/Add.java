import java.util.Arrays;
import java.util.List;

public class ReduceEx{
public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,98);
    long result = list.stream().reduce(0, (a,b) -> a+b );
    System.out.println(result);

 }
}
