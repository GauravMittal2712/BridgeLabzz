import java.util.Scanner;

public class Day6Q1 {
    public void Fabonaci(int n) {

        int a = 0;
        int b = 1;
        int c;
        int i = 0;
        while (i < n) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
            i++;
        }
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            Day6Q1 dq = new Day6Q1();
            dq.Fabonaci(n);
        }
    }

