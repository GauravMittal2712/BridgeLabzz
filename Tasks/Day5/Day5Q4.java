import java.util.Scanner;

public class Day5Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double res = 0;
        for(int i = 1;i<=n;i++){
            res+=1.0/i;
        }
        System.out.println(res);
    }
}
