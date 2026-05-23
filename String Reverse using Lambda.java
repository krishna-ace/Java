interface ReverseString {
    String reverse(String str);
}

public class StringReverseLambda {
    public static void main(String[] args) {

        ReverseString rev = str ->
                new StringBuilder(str).reverse().toString();

        System.out.println(rev.reverse("Krishna"));
    }
}
