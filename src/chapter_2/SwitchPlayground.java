package chapter_2;

public class SwitchPlayground {
    enum ClamBait {FRESH, SALTED, ARTIFICIAL};

    public static void main (String[] args) {
        printBait(ClamBait.SALTED);
        System.out.println("next");
        printBait(ClamBait.FRESH);
    }

    private static void printBait(ClamBait bait) {
        switch (bait)
        {
            case SALTED:
                System.out.println("Salted");
            default:
                System.out.println("Don't know");
            case FRESH:
                System.out.println("Fresh");
                break;
            case ARTIFICIAL:
                System.out.println("Artificial");
                break;

        }
    }
}
