import java.util.Scanner;

public class Day6Q2 {
    public void Primenumber(int n){
        if(n<=1){
            System.out.println("Enter the right number:");
        }
        boolean isp=true;
        for(int i = 2;i<n;i++){
            if(n%i==0){
                isp = false;
                break;
            }
        }




        if(isp){
            System.out.println("This number is prime number: "+n);
        }
        else {
            System.out.println("This number is not a prime number");
        }


    }
    public static void main(String[] arg0s) {
        Day6Q2 dy2 = new Day6Q2();
        Scanner sc=  new Scanner((System.in));
        int n = sc.nextInt();
        dy2.Primenumber(n);

    }
}
