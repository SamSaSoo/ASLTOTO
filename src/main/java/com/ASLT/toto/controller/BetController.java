package com.ASLT.toto.controller;

import com.ASLT.toto.domain.Bet;
import com.ASLT.toto.domain.Match;
import com.ASLT.toto.domain.Member;
import com.ASLT.toto.repository.BetRepository;
import com.ASLT.toto.repository.MatchRepository;
import com.ASLT.toto.repository.MemberRepository;
import com.ASLT.toto.view.BetRequest;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/bets")
@Transactional
public class BetController {

    private final BetRepository betRepository;
    private final MatchRepository matchRepository;
    private final MemberRepository memberRepository;


    public BetController(BetRepository betRepository, MatchRepository matchRepository, MemberRepository memberRepository) {
        this.betRepository = betRepository;
        this.matchRepository = matchRepository;
        this.memberRepository = memberRepository;
    }

    @PostMapping("")
    public Bet saveBet(@RequestBody BetRequest betRequest) {

        Match match = matchRepository.findById(betRequest.getMatchId());
        Member member = memberRepository.findById(betRequest.getMatchId());

        Bet bet = new Bet(betRequest.getStake(),betRequest.getOdds(),match,member, betRequest.getSelectedOption());
        member.subtractBalance(betRequest.getStake());
        memberRepository.save(member);
        return betRepository.save(bet);
    }

    @GetMapping("/{id}")
    public Bet findBet(@PathVariable Long id) {
        return betRepository.findById(id);
    }



}
