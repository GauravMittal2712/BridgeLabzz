import java.util.Scanner;

public class Day27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);


        ch = Character.toLowerCase(ch);

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("It is a Vowel");
            } else {
                System.out.println("It is a Consonant");
            }
        } else {
            System.out.println("Invalid input! Please enter an alphabet.");
        }

        sc.close();
    }
}

