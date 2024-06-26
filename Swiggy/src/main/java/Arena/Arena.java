package Arena;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Arena {
    private List<Player> players;

    public Arena() {
        players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void startGame() {
        if (players.size() != 2) {
            System.out.println("Error: Exactly two players are required to start a game.");
            return;
        }

        Player player1 = players.get(0);
        Player player2 = players.get(1);

        Game game = new Game(player1, player2);
        game.start();
    }

    public Collection<Object> getPlayers() {
        return null;
    }
}