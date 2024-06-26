package Arena;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArenaTest {

    @Test
    public void testAddPlayer() {
        Arena arena = new Arena();
        Player player1 = new Player(100, 10, 10);
        Player player2 = new Player(80, 8, 12);

        arena.addPlayer(player1);
        arena.addPlayer(player2);

        assertEquals(2, arena.getPlayers().size());
        assertTrue(arena.getPlayers().contains(player1));
        assertTrue(arena.getPlayers().contains(player2));
    }

    @Test
    public void testStartGameWithTwoPlayers() {
        Arena arena = new Arena();
        Player player1 = new Player(100, 10, 10);
        Player player2 = new Player(80, 8, 12);

        arena.addPlayer(player1);
        arena.addPlayer(player2);

        // Mock the dice rolls
        DiceRollerMock.setNextRolls(5, 3, 4, 2); // Player 1 attacks first

        arena.startGame();

        assertTrue(player1.isAlive() ^ player2.isAlive());
    }

    @Test(expected = IllegalStateException.class)
    public void testStartGameWithInvalidNumberOfPlayers() {
        Arena arena = new Arena();
        Player player1 = new Player(100, 10, 10);

        arena.addPlayer(player1);
        arena.startGame();
    }

    // Helper class to mock the DiceRoller
    private static class DiceRollerMock {
        private static int[] rolls = new int[0];
        private static int currentRoll = 0;

        public static void setNextRolls(int... rolls) {
            DiceRollerMock.rolls = rolls;
            currentRoll = 0;
        }

        public static int rollDice(int numSides) {
            int roll = rolls[currentRoll];
            currentRoll++;
            return roll;
        }
    }
}