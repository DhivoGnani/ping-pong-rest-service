package hello;

import models.Tournament;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TournamentController {

    @RequestMapping("/tournaments")
    public List<Tournament> tournaments()
    {
        Tournament tournament = new Tournament(1);
        Tournament secondTournament  = new Tournament(2);
        List<Tournament> list = new ArrayList<>();
        list.add(tournament);
        list.add(secondTournament);

        return list;
    }

    @RequestMapping("/tournaments/{tournamentId}")
    public Tournament matches(@PathVariable long tournamentID)
    {
        return new Tournament(tournamentID);
    }
}
