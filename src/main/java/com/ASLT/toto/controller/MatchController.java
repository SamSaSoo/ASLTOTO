package com.ASLT.toto.controller;

import com.ASLT.toto.domain.Match;
import com.ASLT.toto.repository.MatchRepository;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/matches")
@Transactional
public class MatchController {

    private final MatchRepository matchRepository;

    public MatchController(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    @PostMapping("")
    public Match saveMatch(@RequestBody Match match) {
        return matchRepository.save(match);
    }

    @GetMapping("/{id}")
    public Match findMatch(@PathVariable Long id) {
        return matchRepository.findById(id);
    }

}
