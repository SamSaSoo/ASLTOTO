package com.ASLT.toto.repository;

import com.ASLT.toto.domain.Match;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

@Repository
public class MatchRepository {

    private final EntityManager em;

    public MatchRepository(EntityManager em) {
        this.em = em;
    }

    public Match save(Match match) {
        em.persist(match);
        return match;
    }

    public Match findById(Long id) {
        return em.find(Match.class, id);
    }




}
