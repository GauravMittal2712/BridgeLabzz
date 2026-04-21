import java.util.Random;

public class Day7Q1 {

    static final int STAKE = 100;
    static final int BET = 1;
    static final int DAYS = 20;
    static final int WIN_LIMIT = 150;
    static final int LOSS_LIMIT = 50;

    public static void main(String[] args) {

        int totalAmount = 0;
        int winDays = 0;
        int lossDays = 0;

        int maxWin = Integer.MIN_VALUE;
        int maxLoss = Integer.MAX_VALUE;

        int luckiestDay = 0;
        int unluckiestDay = 0;

        for (int day = 1; day <= DAYS; day++) {

            int money = STAKE;
            Random rand = new Random();

            // UC2 + UC3: Play till win or loss limit
            while (money > LOSS_LIMIT && money < WIN_LIMIT) {
                if (rand.nextBoolean()) {
                    money += BET;  // win
                } else {
                    money -= BET;  // loss
                }
            }

            int dailyResult = money - STAKE;
            totalAmount += dailyResult;

            // UC5: count win/loss days
            if (dailyResult > 0) {
                winDays++;
            } else {
                lossDays++;
            }

            // UC6: track luckiest/unluckiest day
            if (dailyResult > maxWin) {
                maxWin = dailyResult;
                luckiestDay = day;
            }

            if (dailyResult < maxLoss) {
                maxLoss = dailyResult;
                unluckiestDay = day;
            }
        }

        // UC4 Output
        System.out.println("Total amount after 20 days: " + totalAmount);

        // UC5 Output
        System.out.println("Winning days: " + winDays);
        System.out.println("Losing days: " + lossDays);

        // UC6 Output
        System.out.println("Luckiest day: Day " + luckiestDay);
        System.out.println("Unluckiest day: Day " + unluckiestDay);

        // UC7 Decision
        if (totalAmount > 0) {
            System.out.println("Continue gambling next month");
        } else {
            System.out.println("Stop gambling");
        }
    }
}
