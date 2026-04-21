import java.util.Scanner;

public class Day6Q6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Press Enter to START");
        sc.nextLine();

        long start = System.currentTimeMillis();

        System.out.println("Press Enter to STOP");
        sc.nextLine();

        long end = System.currentTimeMillis();

        long elapsed = end - start;

        System.out.println("Elapsed Time: " + elapsed + " ms");

        sc.close();
    }
}