package Arena;

public class Player {
    private int health;
    private int strength;
    private int attack;
    private final String name;

    public Player(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttack() {
        return attack;
    }

    public void takeDamage(int damage) {
        health = Math.max(0, health - damage);
    }

    public int attack(int diceRoll) {
        return attack * diceRoll;
    }

    public int defend(int diceRoll) {
        return strength * diceRoll;
    }

    public boolean isAlive() {
        return health > 0;
    }
    public String getName() {
        return name;
    }
}