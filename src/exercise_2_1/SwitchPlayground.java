package exercise_2_1;

public class SwitchPlayground {


    public static void main (String[] args) {
        printBait("SALTED");
        System.out.println("next");
        printBait("FRESH");
    }

    private static void printBait(String bait) {
        switch (bait)
        {
            case "SALTED":
                System.out.println("Salted");
            default:
                System.out.println("Don't know");
            case "FRESH":
                System.out.println("Fresh");
                break;
            case "ARTIFICIAL":
                System.out.println("Artificial");
                break;

        }
    }
}
