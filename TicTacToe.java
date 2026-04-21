import java.util.Scanner;
import java.util.Random;

public class TicTacToeToss {

    static String player1Symbol;
    static String player2Symbol;
    static String currentPlayer;

    public static void performToss() {
        Random random = new Random();
        int tossResult = random.nextInt(2); // 0 or 1

        if (tossResult == 0) {
            currentPlayer = "Player 1";
            player1Symbol = "X";
            player2Symbol = "O";
        } else {
            currentPlayer = "Player 2";
            player2Symbol = "X";
            player1Symbol = "O";
        }
    }

    public static void displayResult() {
        System.out.println("=== Toss Result ===");
        System.out.println(currentPlayer + " starts first!");
        System.out.println("Player 1 -> " + player1Symbol);
        System.out.println("Player 2 -> " + player2Symbol);
        System.out.println("Current Player: " + currentPlayer);
    }

    public static void main() {
        performToss();
        displayResult();
    }
}