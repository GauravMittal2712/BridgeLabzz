import java.util.ArrayList;
import java.util.Scanner;

// Stock class
class Stock {
    String name;
    int numberOfShares;
    double sharePrice;

    public Stock(String name, int numberOfShares, double sharePrice) {
        this.name = name;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }

    public double getValue() {
        return numberOfShares * sharePrice;
    }
}

// Portfolio class
class StockPortfolio {
    ArrayList<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public double totalValue() {
        double total = 0;
        for (Stock s : stocks) {
            total += s.getValue();
        }
        return total;
    }

    public void printReport() {
        System.out.println("\n----- Stock Report -----");
        for (Stock s : stocks) {
            System.out.println("Stock Name: " + s.name);
            System.out.println("Shares: " + s.numberOfShares);
            System.out.println("Price: " + s.sharePrice);
            System.out.println("Value: " + s.getValue());
            System.out.println("----------------------");
        }
        System.out.println("Total Portfolio Value: " + totalValue());
    }
}

// Main class
public class Q1Day11and12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StockPortfolio portfolio = new StockPortfolio();

        System.out.print("Enter number of stocks: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for stock " + (i + 1));

            System.out.print("Stock Name: ");
            String name = sc.nextLine();

            System.out.print("Number of Shares: ");
            int shares = sc.nextInt();

            System.out.print("Share Price: ");
            double price = sc.nextDouble();
            sc.nextLine(); // consume newline

            Stock stock = new Stock(name, shares, price);
            portfolio.addStock(stock);
        }

        portfolio.printReport();
    }
}
