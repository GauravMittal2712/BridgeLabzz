import java.util.ArrayList;

class Hotel {

    String name;
    int weekdayRate;
    int weekendRate;
    int rating;

    // Constructor
    Hotel(String name, int weekdayRate, int weekendRate, int rating) {

        this.name = name;
        this.weekdayRate = weekdayRate;
        this.weekendRate = weekendRate;
        this.rating = rating;
    }
}

public class Day26Q1 {

    static ArrayList<Hotel> hotels = new ArrayList<>();

    // UC1 - Add Hotels
    static void addHotels() {

        hotels.add(new Hotel("Lakewood", 110, 90, 3));
        hotels.add(new Hotel("Bridgewood", 150, 50, 4));
        hotels.add(new Hotel("Ridgewood", 220, 150, 5));

        System.out.println("Hotels Added Successfully!");
    }

    // UC2 + UC3 + UC4 + UC5 + UC6 + UC7
    static void findCheapestHotel(int weekdayCount, int weekendCount) {

        int minimumCost = Integer.MAX_VALUE;

        // Find minimum cost
        for (Hotel hotel : hotels) {

            int totalCost =
                    (hotel.weekdayRate * weekdayCount) +
                            (hotel.weekendRate * weekendCount);

            if (totalCost < minimumCost) {
                minimumCost = totalCost;
            }
        }

        Hotel bestHotel = null;

        // Find best rated among cheapest
        for (Hotel hotel : hotels) {

            int totalCost =
                    (hotel.weekdayRate * weekdayCount) +
                            (hotel.weekendRate * weekendCount);

            if (totalCost == minimumCost) {

                if (bestHotel == null ||
                        hotel.rating > bestHotel.rating) {

                    bestHotel = hotel;
                }
            }
        }

        System.out.println("\nCheapest Best Rated Hotel");
        System.out.println("Hotel Name : " + bestHotel.name);
        System.out.println("Rating     : " + bestHotel.rating);
        System.out.println("Total Cost : $" + minimumCost);
    }

    // UC7 - Best Rated Hotel
    static void findBestRatedHotel(int weekdayCount, int weekendCount) {

        Hotel bestRated = hotels.get(0);

        for (Hotel hotel : hotels) {

            if (hotel.rating > bestRated.rating) {
                bestRated = hotel;
            }
        }

        int totalCost =
                (bestRated.weekdayRate * weekdayCount) +
                        (bestRated.weekendRate * weekendCount);

        System.out.println("\nBest Rated Hotel");
        System.out.println("Hotel Name : " + bestRated.name);
        System.out.println("Rating     : " + bestRated.rating);
        System.out.println("Total Cost : $" + totalCost);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Hotel Reservation Program");

        // Add Hotels
        addHotels();

        // Example:
        // 2 Weekdays and 1 Weekend

        int weekdayCount = 2;
        int weekendCount = 1;

        // Cheapest Hotel
        findCheapestHotel(weekdayCount, weekendCount);

        // Best Rated Hotel
        findBestRatedHotel(weekdayCount, weekendCount);
    }
}