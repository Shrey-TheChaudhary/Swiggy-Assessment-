package Arena;

import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    private Object strength;

    public GameTest(Object strength) {
        this.strength = strength;
    }

    @Test
    public void testGameWithEqualPlayers() {
        int strength = 0;
        Player player1 = new Player(100, 10, 10);
        Player player2 = new Player(100, 10, 10);
        Game game = new Game(player1, player2);

        // Mock the dice rolls
        DiceRollerMock.setNextRolls(5, 3, 4, 2); // Player 1 attacks first

        game.start();

        assertTrue(player1.isAlive() ^ player2.isAlive());
    }

    @Test
    public void testGameWithDifferentPlayers() {
        Player player1 = new Player(50, 5, 10);
        Player player2 = new Player(100, 10, 5);
        Game game = new Game(player1, player2);

        // Mock the dice rolls
        DiceRollerMock.setNextRolls(5, 2, 4, 3, 6, 1); // Player 1 attacks first

        game.start();

        assertFalse(player1.isAlive());
        assertTrue(player2.isAlive());
    }

    @Test
    public void testGetInitialAttacker() {
        Player player1 = new Player(50, 5, 10);
        Player player2 = new Player(100, 10, 5);
        Game game = new Game(player1, player2);

        Player initialAttacker = game.getInitialAttacker();
        assertEquals(player1, initialAttacker);
    }

    // Helper class to mock the DiceRoller
    private static class DiceRollerMock {
        private static int currentRoll = 0;

        public static void setNextRolls(int... rolls) {
            currentRoll = 0;
        }

    }
}