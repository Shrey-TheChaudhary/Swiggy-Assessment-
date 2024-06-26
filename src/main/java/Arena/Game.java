package Arena;

import java.util.Random;


public class Game {
    private final Player player1;
    private final Player player2;
    private final Random random;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.random = new Random();
    }

    public void start() {
        Player attacker = getInitialAttacker();
        Player defender = attacker == player1 ? player2 : player1;

        while (player1.isAlive() && player2.isAlive()) {
            int attackerDiceRoll = random.nextInt(6) + 1; // Roll a 6-sided die
            int defenderDiceRoll = random.nextInt(6) + 1;

            int attackDamage = attacker.attack(attackerDiceRoll);
            int defendStrength = defender.defend(defenderDiceRoll);

            int effectiveDamage = Math.max(0, attackDamage - defendStrength);
            defender.takeDamage(effectiveDamage);

            System.out.println(attacker.getName() + " attacks with " + attackDamage + " damage");
            System.out.println(defender.getName() + " defends with " + defendStrength + " strength");
            System.out.println(defender.getName() + " takes " + effectiveDamage + " damage");
            System.out.println(player1.getName() + " health: " + player1.getHealth());
            System.out.println(player2.getName() + " health: " + player2.getHealth());
            System.out.println();

            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        Player winner = player1.isAlive() ? player1 : player2;
        System.out.println(winner.getName() + " wins!");
    }

    Player getInitialAttacker() {
        return player1.getHealth() < player2.getHealth() ? player1 : player2;
    }
}











