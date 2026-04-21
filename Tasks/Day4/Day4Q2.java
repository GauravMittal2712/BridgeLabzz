import java.util.Random;

class Day4Q2 {

    static final int WIN_POSITION = 100;

    // Method to roll dice (1–6)
    public static int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    // Method to check option (No Play, Ladder, Snake)
    public static int getOption() {
        Random random = new Random();
        return random.nextInt(3); // 0 = No Play, 1 = Ladder, 2 = Snake
    }

    public void playGame() {

        int player1Pos = 0;
        int player2Pos = 0;
        int diceCount = 0;

        boolean player1Turn = true;

        while (player1Pos < WIN_POSITION && player2Pos < WIN_POSITION) {

            int dice = rollDice();
            int option = getOption();
            diceCount++;

            if (player1Turn) {
                System.out.println("\nPlayer 1 rolls: " + dice);

                player1Pos = movePlayer(player1Pos, dice, option);
                System.out.println("Player 1 position: " + player1Pos);

                // Ladder → play again
                if (option != 1) {
                    player1Turn = false;
                }

            } else {
                System.out.println("\nPlayer 2 rolls: " + dice);

                player2Pos = movePlayer(player2Pos, dice, option);
                System.out.println("Player 2 position: " + player2Pos);

                // Ladder → play again
                if (option != 1) {
                    player1Turn = true;
                }
            }
        }

        System.out.println("\nTotal Dice Rolls: " + diceCount);

        if (player1Pos == WIN_POSITION) {
            System.out.println("🎉 Player 1 Wins!");
        } else {
            System.out.println("🎉 Player 2 Wins!");
        }
    }

    // Movement logic
    private int movePlayer(int position, int dice, int option) {

        switch (option) {
            case 0: // No Play
                System.out.println("No Play");
                break;

            case 1: // Ladder
                System.out.println("Ladder");
                position += dice;
                break;

            case 2: // Snake
                System.out.println("Snake");
                position -= dice;
                break;
        }

        // If position < 0 → reset to 0
        if (position < 0) {
            position = 0;
        }

        // If position > 100 → stay same
        if (position > WIN_POSITION) {
            position -= dice; // undo move
        }

        return position;
    }
    public static void main(String[] args) {

        System.out.println("Welcome to Snake and Ladder Game");

        Day4Q2 game = new Day4Q2();
        game.playGame();
    }
}