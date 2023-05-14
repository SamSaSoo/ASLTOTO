package com.ASLT.toto.repository;

import com.ASLT.toto.domain.Member;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

@Repository // 레퍼지토리인걸 알려주고, 스프링 안에 빈을 띄워줌(유일한 존재)
public class MemberRepository {

    private final EntityManager em;

    public MemberRepository(EntityManager em) {
        this.em = em;
    }

    public Member save(Member member) {
        em.persist(member);
        return member;
    }

}
