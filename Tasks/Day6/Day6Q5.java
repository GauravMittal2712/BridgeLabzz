import java.util.Scanner;

public class Day6Q5 {
    public void Reversenumber(int n){
        int rev=0;
        int digit;
        while(n>0){
            digit = n%10;
            rev = rev*10+digit;
            n= n/10;

        }
        System.out.println(rev);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Day6Q5 dy65 = new Day6Q5();
        int n = sc.nextInt();
        dy65.Reversenumber(n);
        sc.close();
    }
}
