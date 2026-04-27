import  java.util.Scanner;
class Account {
    private String name;
    private double balance;

    // Constructor
    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0.0) {
            this.balance = balance;
        } else {
            this.balance = 0.0;
        }
    }

    // Credit (deposit)
    public void credit(double amount) {
        if (amount > 0.0) {
            balance += amount;
        }
    }

    // Debit (withdraw)
    public void debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Debit amount exceeded account balance.");
        }
    }

    // Getters
    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}
// AccountTest.java


public class Q3Day11and12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create account
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        Account acc = new Account(name, balance);

        System.out.println("\nInitial Balance: " + acc.getBalance());

        // Credit test
        System.out.print("\nEnter deposit amount: ");
        double deposit = sc.nextDouble();
        acc.credit(deposit);
        System.out.println("Balance after deposit: " + acc.getBalance());

        // Debit test
        System.out.print("\nEnter withdrawal amount: ");
        double withdraw = sc.nextDouble();
        acc.debit(withdraw);
        System.out.println("Balance after withdrawal: " + acc.getBalance());

        sc.close();
    }
}