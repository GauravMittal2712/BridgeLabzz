import javax.sound.midi.Soundbank;
import java.awt.*;
import java.util.Scanner;
import java.util.SortedMap;

public class Day5Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 4 digit no.");
        int input = sc.nextInt();
        if(input>999 && input<=9999){
            if((input%4 == 0 && input%100!=0) || (input%400==0)){
                System.out.println("The no Year is a leap year: "+input);
            }
            else{
                System.out.println("The no. is not a leap Year: "+input);
            }
        }
        else {
            System.out.println("Enter the 4 digit no.:");
        }



    }
}
