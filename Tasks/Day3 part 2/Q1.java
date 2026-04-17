
import java.util.Scanner;
import java.util.SortedMap;

public class Q1 {
    public void EmployeeStatus(){
        System.out.println("Inside 1");
        
    }
    public void Dailywages(){
        System.out.println("Inside 2");
    }
    public void Extrawork(){
        System.out.println("Inside 3");
    }

    public static void main(String[] args) {
        Q1 q = new Q1();
        System.out.println("Welcome The Status Screen:");
        System.out.println("Press The Option");
        System.out.println("1:EmployeeStatus");
        System.out.println("2:Dailywages");
        System.out.println("3:Extrawork");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1:
                q.EmployeeStatus();
                break;
            case 2:
                q.Dailywages();
                break;
            case 3:
                q.Extrawork();
                break;
            case 4:
                System.out.println("Wrong no:");
        }
        sc.close();
    }
}
