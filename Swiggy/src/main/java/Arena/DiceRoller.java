package Arena;

import java.util.Random;

public class DiceRoller {
    private static final Random RANDOM = new Random();

    public static int rollDice(int numSides) {
        return RANDOM.nextInt(numSides) + 1;
    }
}