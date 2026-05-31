public class Main {

    static <T extends Number> double plusMethod(T x, T y) {
        return x.doubleValue() + y.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println("int: " + plusMethod(8, 5));
        System.out.println("double: " + plusMethod(4.3, 6.26));
    }
}
