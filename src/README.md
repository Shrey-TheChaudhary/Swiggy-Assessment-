# Magical Arena

Magical Arena is a simple turn-based combat game implemented in Java. In this game, players take turns attacking and defending against each other until one player's health is reduced to zero.

## How to Play

1. Run the `Main` class to start the game.
2. Enter the health, strength, and attack values for Player 1 and Player 2 when prompted.
3. The game will start, and the players will take turns attacking and defending based on their attributes and dice rolls.
4. The game continues until one player's health reaches zero, at which point the other player is declared the winner.

## Project Structure

- `Player.java`: Represents a player in the game, with attributes such as health, strength, and attack.
- `Arena.java`: Represents the arena where the game takes place.
- `Game.java`: Manages the game logic, including player turns, dice rolls, and combat calculations.
- `DiceRoller.java`: A utility class for rolling dice and generating random numbers.
- `Main.java`: The entry point of the application, where the game is set up and executed.
- `PlayerTest.java`: Unit tests for the `Player` class.
- `ArenaTest.java`: Unit tests for the `Arena` class.
- `GameTest.java`: Unit tests for the `Game` class.

## How to Run

1. Ensure you have Java Development Kit (JDK) installed on your machine.
2. Compile the Java files using the following command:
3. Run the `Main` class using the following command:
4. Follow the prompts to enter the player attributes and start the game.

## Testing

This project includes unit tests for the core classes (`Player`, `Arena`, and `Game`). To run the tests, you'll need to have JUnit installed in your development environment.

Once JUnit is set up, you can run the test classes individually or use an IDE or build tool to run all the tests at once.

## Assumptions and Limitations

- The game is played between two players.
- Players take turns attacking and defending based on their attributes and dice rolls.
- The game ends when one player's health reaches zero.
- No user interface or graphics are included; the game is played in the console.