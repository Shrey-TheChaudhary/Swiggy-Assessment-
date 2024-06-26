import Arena.Arena;
import Arena.Player;

import java.util.Scanner;

public class Main {

    private static Object strength;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Magical Arena!");

        System.out.print("Enter Player 1's health: ");
        int player1Health = scanner.nextInt();
        System.out.print("Enter Player 1's strength: ");
        int player1Strength = scanner.nextInt();
        System.out.print("Enter Player 1's attack: ");

        System.out.print("Enter Player 2's health: ");
        int player2Health = scanner.nextInt();
        System.out.print("Enter Player 2's strength: ");
        int player2Strength = scanner.nextInt();
        System.out.print("Enter Player 2's attack: ");

        Player player1 = new Player("player 1",player1Health, player1Strength);
        Player player2 = new Player("player 2",player2Health, player2Strength);

        Arena arena = new Arena();
        arena.addPlayer(player1);
        arena.addPlayer(player2);

        System.out.println("\nLet the battle begin!\n");

        arena.startGame();

        scanner.close();
    }

    public static void setStrength(Object strength) {
        Main.strength = strength;
    }
}