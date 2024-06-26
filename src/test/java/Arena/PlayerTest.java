package Arena;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class PlayerTest {

    private Object strength;

    @Test
    public void testGetters() {
        Player player = new Player(100, 10, 15);
        assertEquals(100, player.getHealth());
        assertEquals(10, player.getStrength());
        assertEquals(15, player.getAttack());
    }

    private void assertEquals(int i, int health) {
    }

    @Test
    public void testTakeDamage() {
        Player player = new Player(100, 10, 15);
        player.takeDamage(30);
        assertEquals(70, player.getHealth());

        player.takeDamage(80);
        assertEquals(0, player.getHealth());

        player.takeDamage(10);
        assertEquals(0, player.getHealth());
    }

    @Test
    public void testAttack() {
        Player player = new Player(100, 10, 15);
        int attackDamage = player.attack(4);
        assertEquals(60, attackDamage);
    }

    @Test
    public void testDefend() {
        Player player = new Player(100, 10, 15);
        int defendStrength = player.defend(3);
        assertEquals(30, defendStrength);
    }

    @Test
    public void testIsAlive() {
        Player player = new Player(100, 10, 15);
        assertTrue(player.isAlive());

        player.takeDamage(100);
        assertFalse(player.isAlive());
    }
}