package hello;

import models.Player;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

public class PlayerController {

    @RequestMapping("/players")
    public List<Player> players()
    {
        Player player = new Player(1, "John", "Doe", 18);
        List<Player> list = new ArrayList<>();
        list.add(player);

        return list;
    }

    @RequestMapping("/players/{playerId}")
    public Player players(@PathVariable long playerId)
    {
        Player player = new Player(playerId, "John", "Smith", 19);
        return player;
    }

    @RequestMapping("/tournaments/{tournamentId}/players")
    public List<Player> tournamentPlayers(@PathVariable long tournamentId)
    {
        Player player = new Player(2, "John", "Snow", 20);
        List<Player> list = new ArrayList<>();
        list.add(player);

        return list;
    }

    @RequestMapping("/tournaments/{tournamentId}/players/{playerId}")
    public Player tournamentPlayers(@PathVariable long tournamentId, @PathVariable long playerId)
    {
        Player player = new Player(playerId, "John", "Lennon", 21);
        return player;
    }
}
