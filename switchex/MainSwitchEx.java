package switchex;
public class MainSwitchEx{

    public static void main(String[] args) {
        int day = 4;
        String result = switch (day){
            case 1,7 -> {
                System.out.println("this is 1,& 7 case");
                yield "Mondy";
            }
            case 2,3,4 -> "Tuesday";
            default -> "No Day";
        };
        System.out.println(result);
    }
}