import java.util.Random;

public class Q2Day11and12 {

    public static void main(String[] args) {

        // Suits and Ranks
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};

        // Step 1: Create Deck
        String[] deck = new String[52];
        int index = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index++] = ranks[j] + " of " + suits[i];
            }
        }

        // Step 2: Shuffle Deck
        Random rand = new Random();

        for (int i = 0; i < deck.length; i++) {
            int randomIndex = rand.nextInt(52);

            // Swap
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }

        // Step 3: Distribute to 4 players (9 cards each)
        String[][] players = new String[4][9];

        int cardIndex = 0;

        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 4; i++) {
                players[i][j] = deck[cardIndex++];
            }
        }

        // Step 4: Print cards
        for (int i = 0; i < 4; i++) {
            System.out.println("\nPlayer " + (i + 1) + " cards:");

            for (int j = 0; j < 9; j++) {
                System.out.println(players[i][j]);
            }
        }
    }
}