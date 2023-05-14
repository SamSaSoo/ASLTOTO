package com.ASLT.toto.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Entity
@NoArgsConstructor
@ToString
public class Bet {

    @Id @GeneratedValue
    Long id;
    BigDecimal stake;
    BigDecimal odds;
    @ManyToOne
    Member member;
    @ManyToOne
    Match match;
    int selectedOption; // 1 or 2


    public Bet(BigDecimal stake, BigDecimal odds, Match match, Member member, int selectedOption) {
        this.stake = stake;
        this.odds = odds;
        this.match = match;
        this.member = member;
        this.selectedOption = selectedOption;
    }
}
