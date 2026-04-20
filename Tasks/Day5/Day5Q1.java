import java.util.Random;
import java.util.Scanner;

public class Day5Q1 {


    public static void main(String[] args) {
        Random rc = new Random();
        int head=0,tails=0,n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 0;i<n;i++){
            double r = rc.nextDouble();
            if(r<0.5){
                tails++;
            }
            else {
                head++;
            }
        }
        System.out.println((tails*100)/n);
        System.out.println((head*100)/n);

    }
}
