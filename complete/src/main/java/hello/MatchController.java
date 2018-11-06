package hello;

import models.Match;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MatchController {

    @RequestMapping("/matches")
    public List<Match> matches()
    {
        Match match = new Match(1);
        Match secondMatch = new Match(2);
        List<Match> list = new ArrayList<>();
        list.add(match);
        list.add(secondMatch);

        return list;
    }

    @RequestMapping("/matches/{matchId}")
    public Match matches(@PathVariable long matchId)
    {
        Match match = new Match(matchId);
        return match;
    }

    @RequestMapping("players/{playerId|/matches")
    public List<Match> playerMatches(@PathVariable long playerId)
    {
        Match match = new Match(3);
        Match secondMatch = new Match(4);
        List<Match> list = new ArrayList<>();
        list.add(match);
        list.add(secondMatch);

        return list;
    }

    @RequestMapping("players/{playerId}/matches/{matchId}")
    public Match playerMatches(@PathVariable long playerId, @PathVariable long matchId)
    {
        return new Match(matchId);
    }

    @RequestMapping("tournaments/{tournamentId}/matches")
    public List<Match> tournamentMatches(@PathVariable long tournamentId)
    {
        Match match = new Match(5);
        Match secondMatch = new Match(6);
        List<Match> list = new ArrayList<>();
        list.add(match);
        list.add(secondMatch);

        return list;
    }

    @RequestMapping("tournaments/{tournamentId}/matches/{matchId}")
    public Match tournamentMatches(@PathVariable long tournamentId, long matchId)
    {
        return new Match(matchId);
    }
}
