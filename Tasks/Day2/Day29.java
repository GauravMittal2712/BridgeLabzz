public class Day29 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide month (m) and day (d)");
            return;
        }
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        boolean isSpring = false;
        if ((m == 3 && d >= 20) ||
                (m == 4) ||
                (m == 5) ||
                (m == 6 && d <= 20)) {
            isSpring = true;
        }
        System.out.println(isSpring);
    }
}