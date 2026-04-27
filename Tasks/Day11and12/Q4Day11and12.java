import java.util.*;
import java.io.*;

// Class representing each stock
class CompanyShares {
    String symbol;
    int shares;
    String dateTime;

    public CompanyShares(String symbol, int shares, String dateTime) {
        this.symbol = symbol;
        this.shares = shares;
        this.dateTime = dateTime;
    }
}

// Main StockAccount class
class StockAccount {

    private List<CompanyShares> list = new ArrayList<>();

    // Constructor (load from file)
    public StockAccount(String filename) {
        try {
            File file = new File(filename);
            if (!file.exists()) return;

            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                String symbol = sc.next();
                int shares = sc.nextInt();
                String dateTime = sc.next();

                list.add(new CompanyShares(symbol, shares, dateTime));
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error reading file");
        }
    }

    // Buy shares
    public void buy(int amount, String symbol) {
        String time = new Date().toString();

        for (CompanyShares cs : list) {
            if (cs.symbol.equals(symbol)) {
                cs.shares += amount;
                cs.dateTime = time;
                return;
            }
        }

        // If stock not found → create new
        list.add(new CompanyShares(symbol, amount, time));
    }

    // Sell shares
    public void sell(int amount, String symbol) {
        String time = new Date().toString();

        for (CompanyShares cs : list) {
            if (cs.symbol.equals(symbol)) {
                if (cs.shares >= amount) {
                    cs.shares -= amount;
                    cs.dateTime = time;
                } else {
                    System.out.println("Not enough shares to sell");
                }
                return;
            }
        }

        System.out.println("Stock not found");
    }

    // Total value (dummy calculation)
    public double valueOf() {
        double total = 0;

        for (CompanyShares cs : list) {
            double price = 100; // assume fixed price
            total += cs.shares * price;
        }

        return total;
    }

    // Save to file
    public void save(String filename) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(filename));

            for (CompanyShares cs : list) {
                pw.println(cs.symbol + " " + cs.shares + " " + cs.dateTime);
            }

            pw.close();
        } catch (Exception e) {
            System.out.println("Error saving file");
        }
    }

    // Print report
    public void printReport() {
        System.out.println("\n---- Stock Report ----");

        for (CompanyShares cs : list) {
            System.out.println("Symbol: " + cs.symbol);
            System.out.println("Shares: " + cs.shares);
            System.out.println("Last Transaction: " + cs.dateTime);
            System.out.println("---------------------");
        }

        System.out.println("Total Value: " + valueOf());
    }
}

// Test class
public class Q4Day11and12 {
    public static void main(String[] args) {

        StockAccount acc = new StockAccount("data.txt");

        acc.buy(10, "TCS");
        acc.buy(5, "INFY");

        acc.sell(3, "TCS");

        acc.printReport();

        acc.save("data.txt");
    }
}