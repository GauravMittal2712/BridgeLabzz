public class Day5Q10{
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        // Start from smallest prime number
        for (int i = 2; i * i <= n; i++) {

            // Divide until not divisible
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }

        // If remaining n is greater than 1
        if (n > 1) {
            System.out.print(n);
        }
    }
}