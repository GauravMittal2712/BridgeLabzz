import java.util.Scanner;

public class Day16 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if (n>=1532){
            if((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)){
                System.out.println("Leap year:" + n);
            }
            else{
                System.out.println("Not in this year");
            }
        }else{
            System.out.println("Wrong Year please give me the correct one");
        }
    }
}

