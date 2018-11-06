package hello;

import models.Set;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SetController {

    @RequestMapping("/sets")
    public List<Set> sets()
    {
        Set set = new Set(1);
        Set secondSet = new Set(2);
        List<Set> list = new ArrayList<>();
        list.add(set);
        list.add(secondSet);

        return list;
    }

    @RequestMapping("/sets/{setId}")
    public Set matches(@PathVariable long setId)
    {
        return new Set(setId);
    }

    @RequestMapping("/matches/{matchId}/sets")
    public List<Set> matchSets(@PathVariable long matchId)
    {
        Set set = new Set(3);
        Set secondSet = new Set(4);
        List<Set> list = new ArrayList<>();
        list.add(set);
        list.add(secondSet);

        return list;
    }

    @RequestMapping("/matches/{matchId}/sets/{setId}")
    public Set matchSets(@PathVariable long matchId, @PathVariable long setId)
    {
        return new Set(setId);
    }
}
