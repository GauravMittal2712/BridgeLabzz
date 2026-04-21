import java.util.Scanner;

public class Day5Q7 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int rem =0,ques=0;
        rem = n%3;
        ques = n/3;
        System.out.println(rem);
        System.out.println(ques);
    }

}
