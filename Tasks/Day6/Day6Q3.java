import java.util.Scanner;

public class Day6Q3 {
    public void perfectnumber(int n){
        int sum=0;

        for(int i =1;i<n;i++){
            if(n%i==0){
                sum+=i;
                System.out.println(sum);
            }
        }
        if(sum==n){
            System.out.println("This number is perfect square: "+sum);
        }
        else {
            System.out.println("This number is not a perfect square");
        }


    }
    public static void main(String[] arg0s) {
        Day6Q3 dy3 = new Day6Q3();
        Scanner sc=  new Scanner((System.in));
        int n = sc.nextInt();
        dy3.perfectnumber(n);

    }
}
