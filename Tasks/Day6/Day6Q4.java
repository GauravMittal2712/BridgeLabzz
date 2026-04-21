import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Day6Q4 {

    public void Couponno(int n){
        Set<Integer> set = new HashSet<>();
        Random rc = new Random();
        int cunt=0;
        while(set.size()<n){
            int num = rc.nextInt(n)+1;
            cunt++;
            set.add(num);
        }
        System.out.println(cunt);




    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day6Q4 dy64 =  new Day6Q4();
        int n = sc.nextInt();
        dy64.Couponno(n);
        sc.close();

    }
}