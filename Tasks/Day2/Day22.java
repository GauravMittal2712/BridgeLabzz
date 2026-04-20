import java.util.Scanner;

public class Day22 {
    public void sumofn(int n){
        int sum=n*(n+1)/2;
        System.out.println(sum);
    }
    public void reversethenumber(int no){
        int digit = 0 ;
        while(no!=0){
            int temp = no % 10;
            digit = digit*10 + temp ;
            no = no /10;
        }
        System.out.println(digit);

    }
    public static void main(String[] args) {
        int  n,no;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        no= sc.nextInt();
        Day22 s1= new Day22();
        s1.sumofn(n);
        s1.reversethenumber(no);


    }
}
