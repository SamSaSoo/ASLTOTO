package com.ASLT.toto.repository;

import com.ASLT.toto.domain.Bet;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

@Repository
public class BetRepository {

    private final EntityManager em;

    public BetRepository(EntityManager em) {
        this.em = em;
    }

    public Bet save(Bet bet) {
        em.persist(bet);
        return bet;
    }

    public Bet findById(Long id) {
        return em.find(Bet.class, id);
    }





}
